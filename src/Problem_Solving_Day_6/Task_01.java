package Problem_Solving_Day_6;

import java.util.Scanner;

public class Task_01{
    public void sonlar(int a, int b) {

        for (int i = a + 1; i < b; i++) {

            if (i % 4 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {

        Task_01 obj = new Task_01();

       Scanner input = new Scanner(System.in);

        System.out.print("a ni kiriting: ");
        int a = input.nextInt();

        System.out.print("b ni kiriting: ");
        int b = input.nextInt();

        obj.sonlar(a, b);
    }
}
