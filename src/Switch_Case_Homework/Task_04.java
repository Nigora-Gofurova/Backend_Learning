package Switch_Case_Homework;

import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" sonni kiriting : ");
        int fasllar = input.nextInt();
        switch (fasllar) {
            case 12:
                System.out.println(" Qish ");
                break;
            case 1:
                System.out.println(" Qish ");
                break;
            case 2:
                System.out.println(" Qish ");
                break;
            case 3:
                System.out.println(" Bahor ");
                break;
            case 4:
                System.out.println(" Bahor ");
                break;
            case 5:
                System.out.println(" Bahor ");
                break;
            case 6:
                System.out.println(" Yoz ");
                break;
            case 7:
                System.out.println(" Yoz ");
                break;
            case 8:
                System.out.println(" Yoz ");
                break;
            case 9:
                System.out.println(" Kuz ");
                break;
            case 10:
                System.out.println(" Kuz ");
                break;
            case 11:
                System.out.println(" Kuz ");
                break;
            default:
                System.out.println(" Bunday fasl nomi mavjud emas! ");
                break;
        }
    }
}
