package Problem_Solving_Day_3;

import java.util.Scanner;

public class Task_12 {
    public void check(int a, int b) {

        if (a > 2 && b <= 3) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

    public static void main(String[] args) {

        Task_12 myObj = new Task_12();

       Scanner input = new Scanner(System.in);

        System.out.print("a = ");
        int a = input.nextInt();

        System.out.print("b = ");
        int b = input.nextInt();

        myObj.check(a, b);

    }
}
