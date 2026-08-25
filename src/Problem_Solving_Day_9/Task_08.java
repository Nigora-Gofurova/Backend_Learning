package Problem_Solving_Day_9;

import java.util.Scanner;

public class Task_08 {
    public static void main(String[] args) {
        class_9 obj = new class_9();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A :");
        int n1 = input.nextInt();
        System.out.print("Enter B :");
        int n2 = input.nextInt();
        obj.sonlarniTakrorlash(n1, n2);
    }
}
