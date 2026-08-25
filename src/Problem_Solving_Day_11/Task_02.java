package Problem_Solving_Day_11;

import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        class_11 obj = new class_11();
        Scanner input = new Scanner(System.in);
        System.out.print("Son kiriting: ");
        int son = input.nextInt();
        obj.boluvchilarKopaytmasi(son);
    }
}