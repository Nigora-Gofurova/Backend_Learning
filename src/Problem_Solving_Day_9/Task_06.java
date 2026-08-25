package Problem_Solving_Day_9;

import java.util.Scanner;

public class Task_06 {
    public static void main(String[] args) {
        class_9 obj = new class_9();
        Scanner input = new Scanner(System.in);
        System.out.println("Birinchi son: ");
        int son1 = input.nextInt();
        System.out.println("ikkinchi son: ");
        int son2 = input.nextInt();
        obj.ekubVaEkuk(son1,son2);
    }
}
