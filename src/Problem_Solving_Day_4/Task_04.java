package Problem_Solving_Day_4;

import java.util.Scanner;

public class Task_04 {
    public void  sonlar(int a, int b, int c, int d) {

        if (a == b && b == c && c == d) {
            System.out.print(a + b + c + d);
        } else {

            int max = a;
            int min = a;

            if (b > max) {
                max = b;
            }

            if (c > max) {
                max = c;
            }

            if (d > max) {
                max = d;
            }

            if (b < min) {
                min = b;
            }

            if (c < min) {
                min = c;
            }

            if (d < min) {
                min = d;
            }

            System.out.print(max - min);
        }
    }

    public static void main(String[] args) {

        Task_04 obj = new Task_04();

        Scanner input = new Scanner(System.in);

        System.out.print("a = ");
        int a = input.nextInt();

        System.out.print("b = ");
        int b = input.nextInt();

        System.out.print("c = ");
        int c = input.nextInt();

        System.out.print("d = ");
        int d = input.nextInt();

        obj.sonlar(a, b, c, d);
    }
}
