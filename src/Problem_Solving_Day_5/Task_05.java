package Problem_Solving_Day_5;

import java.util.Scanner;

public class Task_05 {
    public void fasl(int oy) {

        switch (oy) {

            case 12:
            case 1:
            case 2:
                System.out.print("qish");
                break;

            case 3:
            case 4:
            case 5:
                System.out.print("bahor");
                break;

            case 6:
            case 7:
            case 8:
                System.out.print("yoz");
                break;

            case 9:
            case 10:
            case 11:
                System.out.print("kuz");
                break;

            default:
                System.out.print("xato oy");
        }
    }

    public static void main(String[] args) {

        Task_05 obj = new Task_05();

       Scanner input = new Scanner(System.in);

        System.out.print("Oy raqamini kiriting: ");
        int oy = input.nextInt();

        obj.fasl(oy);
    }
}
