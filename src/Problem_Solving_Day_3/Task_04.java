package Problem_Solving_Day_3;

import java.util.Scanner;

public class Task_04 {
    public void season(int oy) {

        if (oy == 12 || oy == 1 || oy == 2) {
            System.out.println("Qish");
        } else if (oy == 3 || oy == 4 || oy == 5) {
            System.out.println("Bahor");
        } else if (oy == 6 || oy == 7 || oy == 8) {
            System.out.println("Yoz");
        } else if (oy == 9 || oy == 10 || oy == 11) {
            System.out.println("Kuz");
        } else {
            System.out.println("Noto'g'ri oy kiritildi.");
        }

    }

    public static void main(String[] args) {

        Task_04 myObj = new Task_04();

        Scanner input = new Scanner(System.in);

        System.out.print("Oy raqamini kiriting: ");
        int oy = input.nextInt();

        myObj.season(oy);

    }
}
