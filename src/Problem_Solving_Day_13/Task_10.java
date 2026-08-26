package Problem_Solving_Day_13;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        class_13 obj = new class_13();
        Scanner input = new Scanner(System.in);
        System.out.print("N kiriting (N>=3, toq son): ");
        int n = input.nextInt();
        obj.konsolShakli10(n);
    }
}