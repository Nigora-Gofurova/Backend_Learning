package Problem_Solving_Day_11;

import java.util.Scanner;

public class Task_09 {
    public static void main(String[] args) {
        class_11 obj = new class_11();
        Scanner input = new Scanner(System.in);
        System.out.print("Belgi kiriting: ");
        char belgi = input.next().charAt(0);
        obj.belginiAniqlash(belgi);
    }
}