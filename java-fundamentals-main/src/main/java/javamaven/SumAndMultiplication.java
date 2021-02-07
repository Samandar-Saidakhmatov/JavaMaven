package javamaven;

import java.util.Scanner;

//Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и
// вывести результат на консоль.
public class SumAndMultiplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input two numbers: ");
        int first_number = in.nextInt();
        int second_number = in.nextInt();

        System.out.println("Sum = " + (first_number + second_number));
        System.out.println("Multiplication = " + first_number * second_number);
    }
}
