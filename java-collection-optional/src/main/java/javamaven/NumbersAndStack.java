package javamaven;

import java.util.Scanner;
import java.util.Stack;

public class NumbersAndStack {
    public static void main(String[] args) {
        //Ввести число, занести его цифры в стек. Вывести число, у которого цифры идут в обратном порядке.
        int inputNumber = 0;

        Stack stack = new Stack();

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Input number: ");
            inputNumber = scanner.nextInt();
        }
        catch (Exception e) {
            System.out.println("It's not a number. Please, input the number");
        }

        char[] numberToDigit = String.valueOf(inputNumber).toCharArray();
        for (char digit : numberToDigit){
            stack.push(digit);
        }

        while (!stack.empty()){
            char deleteDigitsFromStack;

            deleteDigitsFromStack = (Character)stack.pop();
            System.out.println(deleteDigitsFromStack);

        }
    }
}
