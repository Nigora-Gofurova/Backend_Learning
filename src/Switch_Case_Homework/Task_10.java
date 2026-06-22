package Switch_Case_Homework;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bahoni kiriting :");

        int baho = input.nextInt();

        if (baho >= 1 && baho <= 5) {
            System.out.print("natija ");

            switch (baho) {
                case 1:
                    System.out.print("Yomon ");
                    break;
                case 2:
                    System.out.print("Qoniqarsiz ");
                    break;
                case 3:
                    System.out.print("Qoniqarli ");
                    break;
                case 4:
                    System.out.print("Yaxshi ");
                    break;
                case 5:
                    System.out.print("a'lo");
                    break;
            }
        } else {
            System.out.println("xato");
        }
    }
}

