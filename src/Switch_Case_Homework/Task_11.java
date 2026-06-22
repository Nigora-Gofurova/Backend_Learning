package Switch_Case_Homework;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Oy raqamini kiriting : ");
        int oy = input.nextInt();

        switch (oy) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Bu oyda 31 kun bor.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Bu oyda 30 kun bor.");
                break;
            case 2:
                System.out.println("Bu oyda 28 yoki 29 kun bor.");
                break;
            default:
                System.out.println("Siz noto'g'ri oy raqamini kiritdingiz!");
        }
    }
}
