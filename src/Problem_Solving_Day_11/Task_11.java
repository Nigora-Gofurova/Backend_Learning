package Problem_Solving_Day_11;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        class_11 obj = new class_11();
        Scanner input = new Scanner(System.in);
        System.out.print("N kiriting (32-126 oralig'ida): ");
        int n = input.nextInt();
        obj.asciiKodBelgi(n);
    }
}