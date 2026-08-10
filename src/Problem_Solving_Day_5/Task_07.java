package Problem_Solving_Day_5;

import java.util.Scanner;

public class Task_07 {
    public void kunlar(int oy) {

        switch (oy) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("31 kun");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("30 kun");
                break;

            case 2:
                System.out.print("28 kun");
                break;

            default:
                System.out.print("xato oy");
        }
    }

    public static void main(String[] args) {

        Task_07 obj = new Task_07();

        Scanner input = new Scanner(System.in);

        System.out.print("Oy raqamini kiriting: ");
        int oy = input.nextInt();

        obj.kunlar(oy);
    }
}
