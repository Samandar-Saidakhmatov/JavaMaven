package javamaven;

import java.util.Arrays;
import java.util.Scanner;

public class DescendingAscendingOrder {
    void order() {
        Scanner in = new Scanner(System.in);

        System.out.print("Input numbers: ");

        String numbers = in.nextLine();
        char[] result = numbers.toCharArray();

        Arrays.sort(result);                      // sorting in ascending order
        System.out.println("Ascending order: " + Arrays.toString(result));


        //sorting in descending order
        // swap ascending numbers a=b,b=c,c=a
        for (int i = 0; i < result.length / 2; i++) {
            char temp = result[i]; //a=b
            result[i] = result[result.length - 1 - i];  //b=c
            result[result.length - 1 - i] = temp;  //c=a


        }
        System.out.println("Descending order: " + Arrays.toString(result));

    }


    public static void main( String[] args ) {
        DescendingAscendingOrder test = new DescendingAscendingOrder();
        test.order();


    }
}
