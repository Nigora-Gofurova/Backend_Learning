package Switch_Case_Homework;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" hafta kunini kiriting :");
        int hafta = input.nextInt();
        switch (hafta) {
            case 1:
                System.out.println(" duyshanba ");
                break;
            case 2:
                System.out.println(" seshanba ");
                break;
            case 3:
                System.out.println(" chorshanba ");
                break;
            case 4:
                System.out.println(" payshanba ");
                break;
            case 5:
                System.out.println(" juma ");
                break;
            case 6:
                System.out.println(" shanba ");
                break;
            case 7:
                System.out.println(" yakshanba ");
                break;
            default:
                System.out.println(" togri hafta kunini kiriting ");
                break;
        }
    }
}

