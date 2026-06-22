package Switch_Case_Homework;

import java.util.Scanner;

public class Task_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("minus sonni kiriting :");
        int son = input.nextInt();

        if (son >= -999 && son <= -1) {
            System.out.print("minus ");

            son = -son;

            int yuz = son / 100;
            int on = (son / 10) % 10;
            int bir = son % 10;

            switch (yuz) {
                case 1:
                    System.out.print("bir yuz ");
                    break;
                case 2:
                    System.out.print("ikki yuz ");
                    break;
                case 3:
                    System.out.print("uch yuz ");
                    break;
                case 4:
                    System.out.print("tort yuz ");
                    break;
                case 5:
                    System.out.print("besh yuz");
                    break;
                case 6:
                    System.out.print("olti yuz ");
                    break;
                case 7:
                    System.out.print("yetti yuz ");
                    break;
                case 8:
                    System.out.print("sakkiz yuz ");
                    break;
                case 9:
                    System.out.print("toqqiz yuz ");
                    break;
            }
            switch (on) {
                case 1:
                    System.out.print(" o'n ");
                    break;
                case 2:
                    System.out.print(" yigirma ");
                    break;
                case 3:
                    System.out.print(" o'ttiz ");
                    break;
                case 4:
                    System.out.print(" qirq ");
                    break;
                case 5:
                    System.out.print(" ellik ");
                    break;
                case 6:
                    System.out.print(" oltmish ");
                    break;
                case 7:
                    System.out.print(" yetmish ");
                    break;
                case 8:
                    System.out.print(" sakson ");
                    break;
                case 9:
                    System.out.print(" toqson ");
                    break;
            }
            switch (bir) {
                case 1:
                    System.out.print("bir");
                    break;
                case 2:
                    System.out.print("ikki");
                    break;
                case 3:
                    System.out.print("uch");
                    break;
                case 4:
                    System.out.print("tort");
                    break;
                case 5:
                    System.out.print("besh");
                    break;
                case 6:
                    System.out.print("olti");
                    break;
                case 7:
                    System.out.print("yetti");
                    break;
                case 8:
                    System.out.print("sakkiz");
                    break;
                case 9:
                    System.out.print("toqqiz");
                    break;
            }
        } else {
            System.out.println("siz kiritgan son belgilangan chegrada aniqlanmadi ");
        }
    }
}

