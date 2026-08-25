package Problem_Solving_Day_11;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        class_11 obj = new class_11();
        Scanner input = new Scanner(System.in);
        System.out.print("N kiriting: ");
        int n = input.nextInt();
        System.out.print("Belgi kiriting: ");
        char belgi = input.next().charAt(0);
        obj.nTaBelgidanSatr(n, belgi);
    }
}