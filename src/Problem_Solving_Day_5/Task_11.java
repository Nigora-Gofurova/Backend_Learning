package Problem_Solving_Day_5;

import java.util.Scanner;

public class Task_11 {
    public void sonlar(int a, int b) {

        int summa = 0;

        for (int i = a + 1; i < b; i++) {
            summa = summa + i;
        }

        System.out.print(summa);
    }

    public static void main(String[] args) {

        Task_11 obj = new Task_11();

       Scanner input = new Scanner(System.in);

        System.out.print("a ni kiriting: ");
        int a = input.nextInt();

        System.out.print("b ni kiriting: ");
        int b = input.nextInt();

        obj.sonlar(a, b);
    }
}
