package Problem_Solving_Day_5;

import java.util.Scanner;

public class Task_06 {
    public void hafta(int kun) {

        switch (kun) {

            case 1:
                System.out.print("Dushanba");
                break;

            case 2:
                System.out.print("Seshanba");
                break;

            case 3:
                System.out.print("Chorshanba");
                break;

            case 4:
                System.out.print("Payshanba");
                break;

            case 5:
                System.out.print("Juma");
                break;

            case 6:
                System.out.print("Shanba");
                break;

            case 7:
                System.out.print("Yakshanba");
                break;

            default:
                System.out.print("xato kun");
        }
    }

    public static void main(String[] args) {

        Task_06 obj = new Task_06();

        Scanner input = new Scanner(System.in);

        System.out.print("Kun raqamini kiriting: ");
        int kun = input.nextInt();

        obj.hafta(kun);
    }
}
