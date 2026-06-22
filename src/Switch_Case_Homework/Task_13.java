package Switch_Case_Homework;

import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Qancha pulingiz bor :");
        double som = input.nextDouble();

        System.out.println("1  Dollar");
        System.out.println("2  Yevro");
        System.out.println("3  Rubl");
        System.out.print("Tanlang 1, 2 yoki 3 :");

        int tanlov = input.nextInt();

        switch (tanlov) {
            case 1:
                System.out.println("Natija: " + (som / 13000) + " dollar");
                break;
            case 2:
                System.out.println("Natija: " + (som / 14000) + " yevro");
                break;

            case 3:
                System.out.println("Natija: " + (som / 140) + " rubl");
                break;
            default:
                System.out.println("XATO ! ");
                break;
        }
    }
}
