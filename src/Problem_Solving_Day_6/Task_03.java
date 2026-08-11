package Problem_Solving_Day_6;

import java.util.Scanner;

public class Task_03 {
    public void sonlar(int a, int b) {

        int count = 0;

        for (int i = a; i <= b; i++) {

            System.out.print(i + " ");
            count++;
        }

        System.out.println();
        System.out.print("Sonlar soni: " + count);
    }

    public static void main(String[] args) {

        Task_03 obj = new Task_03();

        Scanner input = new Scanner(System.in);

        System.out.print("a ni kiriting: ");
        int a = input.nextInt();

        System.out.print("b ni kiriting: ");
        int b = input.nextInt();

        obj.sonlar(a, b);
    }
}
