package javamaven;

import java.util.Scanner;

//Отобразить в окне консоли аргументы командной строки в обратном порядке.
public class ReverseOrder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input: ");
        String variable = in.nextLine();
        char[] result = variable.toCharArray();
        for(int i = result.length-1; i >= 0; i--){
            System.out.println("Reverse: " + result[i]);
        }

    }
}
