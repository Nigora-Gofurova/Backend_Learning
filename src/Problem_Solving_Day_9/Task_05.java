package Problem_Solving_Day_9;

import java.util.Scanner;

public class Task_05 {
    public static void main(String[] args) {
        class_9 obj  = new class_9();
        Scanner input = new Scanner(System.in);
        System.out.print("Birinchi son: ");
        int a = input.nextInt();
        System.out.print("Ikkinchi son: ");
        int b = input.nextInt();
        obj.ekuk(a, b);
    }
}
