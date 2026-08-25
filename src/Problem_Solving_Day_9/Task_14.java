package Problem_Solving_Day_9;

import java.util.Scanner;

public class Task_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yigindi = 0;

        System.out.println("Sonlarni kiriting 0 kelguncha :");
        while (true) {
            int son = input.nextInt();
            if (son == 0) {
                break;
            }
            if (son > 0) {
                yigindi = yigindi + son;
            }
        }

        System.out.println("Summa = " + yigindi);

    }
}
