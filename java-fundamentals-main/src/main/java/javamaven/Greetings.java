package javamaven;

import java.util.Scanner;

//Приветствовать любого пользователя при вводе его имени через командную строку.
class Greetings {
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();

        System.out.println("Welcome " + name);
        in.close();
    }
}
