package Switch_Case_Homework;

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fasl raqamini kiriting: ");
        int fasl = input.nextInt();

        switch (fasl) {
            case 1:
                System.out.println("Qish");
                break;
            case 2:
                System.out.println("Bahor");
                break;
            case 3:
                System.out.println("Yoz");
                break;
            case 4:
                System.out.println("Kuz");
                break;
            default:
                System.out.println("Bunday fasl nomi mavjud emas!");
        }
    }
}
