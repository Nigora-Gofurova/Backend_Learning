package Problem_Solving_Day_3;

import java.util.Scanner;

public class Task_13{
    public void check(int a, int b, int c) {

        int count = 0;

        if (a > 0) count++;
        if (b > 0) count++;
        if (c > 0) count++;

        if (count == 2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

    public static void main(String[] args) {

        Task_13 myObj = new Task_13();

      Scanner input = new Scanner(System.in);

        System.out.print("a = ");
        int a = input.nextInt();

        System.out.print("b = ");
        int b = input.nextInt();

        System.out.print("c = ");
        int c = input.nextInt();

        myObj.check(a, b, c);

    }
}
