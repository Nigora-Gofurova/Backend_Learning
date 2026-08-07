package Problem_Solving_Day_3;

import java.util.Scanner;

public class Task_11 {
    public void check(int a, int b, int c) {

        if (Math.abs(a - b) >= 10 || Math.abs(a - c) >= 10 || Math.abs(b - c) >= 10) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

    public static void main(String[] args) {

        Task_11 myObj = new Task_11();

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
