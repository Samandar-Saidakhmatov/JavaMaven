package javamaven;

//Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

public class NumbersWithShiftingToNewLine {
    public static void main(String[] args) {
        int[] a = {2, 3, 8, 9, 5, 6};
        for (int i : a) {
            System.out.println(i);
            System.out.print(i);
        }
    }
}
