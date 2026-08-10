package Problem_Solving_Day_5;

import java.util.Scanner;

public class Task_02 {
    public void orta(int a, int b, int c) {

        if ((a > b && a < c) || (a < b && a > c)) {
            System.out.print(a);
        } else if ((b > a && b < c) || (b < a && b > c)) {
            System.out.print(b);
        } else {
            System.out.print(c);
        }
    }

    public static void main(String[] args) {

        Task_02 obj = new Task_02();

       Scanner input = new Scanner(System.in);

        System.out.print("a: ");
        int a = input.nextInt();

        System.out.print("b: ");
        int b = input.nextInt();

        System.out.print("c: ");
        int c = input.nextInt();

        obj.orta(a, b, c);
    }
}
