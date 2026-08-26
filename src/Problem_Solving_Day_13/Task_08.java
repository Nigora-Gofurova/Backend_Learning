package Problem_Solving_Day_13;

import java.util.Scanner;

public class Task_08 {
    public static void main(String[] args) {
        class_13 obj = new class_13();
        Scanner input = new Scanner(System.in);
        System.out.print("a kateti kiriting: ");
        double a = input.nextDouble();
        System.out.print("b kateti kiriting: ");
        double b = input.nextDouble();
        obj.uchburchak(a, b);
    }
}