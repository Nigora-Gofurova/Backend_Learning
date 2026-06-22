package Switch_Case_Homework;

import java.util.Scanner;

public class Task_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" sonni kiriting :");
        int raqam = input.nextInt();

        if (raqam >= -99  &&  raqam <= -1) {
            System.out.print("minus ");

            raqam=-raqam;

            int on = raqam / 10;
            int bir = raqam % 10;

            switch (on) {
                case 1:
                    System.out.print(" o'n ");
                    break;
                case 2:
                    System.out.print("yigirma ");
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
                    System.out.print("oltmish ");
                    break;
                case 7:
                    System.out.print(" yetmish ");
                    break;
                case 8:
                    System.out.print(" sakson ");
                    break;
                case 9:
                    System.out.print(" to'qson ");
                    break;
            }
            switch(bir){
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
                    System.out.print("to'rt");
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
                    System.out.print("to'qqiz");
                    break;
            }
        }else{
            System.out.print(" hato son kiritdingiz ");
        }
    }
}