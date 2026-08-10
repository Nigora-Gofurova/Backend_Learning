package Problem_Solving_Day_5;

import java.util.Scanner;

public class Task_10 {
    public void chiqar(int a, int b) {

        for (int i = 0; i < b; i++) {
            System.out.print(a + " ");
        }
    }

    public static void main(String[] args) {

        Task_10 obj = new Task_10();

       Scanner input = new Scanner(System.in);

        System.out.print("a ni kiriting: ");
        int a = input.nextInt();

        System.out.print("b ni kiriting: ");
        int b = input.nextInt();

        obj.chiqar(a, b);
    }
}
