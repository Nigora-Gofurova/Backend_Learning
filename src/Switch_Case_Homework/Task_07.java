package Switch_Case_Homework;

import java.util.Scanner;

public class Task_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("sonni kiriting : ");
        int son = input.nextInt();

        if (son > 1 && son < 10000) {

            int ming = son / 1000;
            int yuz = (son % 100) / 10;
            int on = (son / 10) % 10;
            int bir = son % 10;

            switch (ming) {
                case 1:
                    System.out.print("bir ming ");
                    break;
                case 2:
                    System.out.print("ikki ming ");
                    break;
                case 3:
                    System.out.print("uch mimg ");
                    break;
                case 4:
                    System.out.print("tort ming ");
                    break;
                case 5:
                    System.out.print("besh ming ");
                    break;
                case 6:
                    System.out.print("olti ming ");
                    break;
                case 7:
                    System.out.print("yetti ming ");
                    break;
                case 8:
                    System.out.print("sakkiz ming ");
                    break;
                case 9:
                    System.out.print("toqqiz ming ");
                    break;
            }
            switch (yuz) {
                case 1:
                    System.out.print(" bir yuz ");
                    break;
                case 2:
                    System.out.print(" ikki yuz ");
                    break;
                case 3:
                    System.out.print(" uch yuz ");
                    break;
                case 4:
                    System.out.print(" tort yuz ");
                    break;
                case 5:
                    System.out.print(" besh yuz ");
                    break;
                case 6:
                    System.out.print(" olti yuz ");
                    break;
                case 7:
                    System.out.print(" yetti yuz ");
                    break;
                case 8:
                    System.out.print(" sakkiz yuz ");
                    break;
                case 9:
                    System.out.print(" toqqiz yuz ");
                    break;
            }
            switch(on){
                case 1:
                    System.out.print("o'n ");
                    break;
                case 2:
                    System.out.print("yigirma ");
                    break;
                case 3:
                    System.out.print("o'ttiz ");
                    break;
                case 4:
                    System.out.print("qirq ");
                    break;
                case 5:
                    System.out.print("ellik ");
                    break;
                case 6:
                    System.out.print("oltmish ");
                    break;
                case 7:
                    System.out.print("yetmish ");
                    break;
                case 8:
                    System.out.print("sakson ");
                    break;
                case 9:
                    System.out.print("toqson ");
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
        }else{
            System.out.println("siz kiritgan son belgilangan chegrada aniqlanmadi ");
        }
    }
}
