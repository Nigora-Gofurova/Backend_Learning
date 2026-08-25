package Problem_Solving_Day_12;

import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        class_12 obj = new class_12();
        Scanner input = new Scanner(System.in);
        System.out.print("Son kiriting (1-99): ");
        int son = input.nextInt();
        obj.sonniSozga(son);
    }
}