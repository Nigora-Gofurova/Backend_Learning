package Problem_Solving_Day_10;

import java.util.Scanner;

public class Task_09 {
    public static void main(String[] args) {
        class_10 obj = new class_10();
       Scanner input = new Scanner(System.in);
        System.out.print("Birinchi katet: ");
        double a = input.nextDouble();
        System.out.print("Ikkinchi katet: ");
        double b = input.nextDouble();
        obj.uchburchak(a, b);
    }
}
