package Homework;

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("hafta kunlarini raqamini kiritingv :");
        int son = input.nextInt();

        String raqam = " ";

        switch (son) {
            case 1:
                raqam = "Duyshanba";
                break;
            case 2:
                raqam = "Seshanba";
                break;
            case 3:
                raqam = "Chorshanba";
                break;
            case 4:
                raqam = "Payshanba";
                break;
            case 5:
                raqam = "JUMA";
                break;
            case 6:
                raqam = "Shanba";
                break;
            case 7:
                raqam = "Yakshanba";
                break;
            default:
                System.out.print("XATO ");
        }
        System.out.println(raqam);
    }
}
