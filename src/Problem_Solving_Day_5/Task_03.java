package Problem_Solving_Day_5;

import java.util.Scanner;

public class Task_03 {
    public void sonlar(int a, int b, int c) {

        if (a < b && b < c) {

            a = a * 2;
            b = b * 2;
            c = c * 2;

        } else {

            a = -a;
            b = -b;
            c = -c;
        }

        System.out.print(a + " " + b + " " + c);
    }

    public static void main(String[] args) {

        Task_03 obj = new Task_03();

        Scanner input = new Scanner(System.in);

        System.out.print("a: ");
        int a = input.nextInt();

        System.out.print("b: ");
        int b = input.nextInt();

        System.out.print("c: ");
        int c = input.nextInt();

        obj.sonlar(a, b, c);
    }
}
