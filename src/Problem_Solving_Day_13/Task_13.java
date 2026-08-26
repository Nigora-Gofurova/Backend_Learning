package Problem_Solving_Day_13;

import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        class_13 obj = new class_13();
        Scanner input = new Scanner(System.in);
        System.out.print("a kiriting: ");
        int a = input.nextInt();
        System.out.print("b kiriting: ");
        int b = input.nextInt();
        obj.aSoniBMarta(a, b);
    }
}