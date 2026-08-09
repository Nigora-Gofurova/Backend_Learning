package Problem_Solving_Day_4;

import java.util.Scanner;

public class Task_13 {
    public void Son(int a) {

        if (a > 0) {
            a = a + 1;

        } else if (a < 0) {
            a = a - 2;

        } else {
            a = 10;
        }

        System.out.print(a);
    }

    public static void main(String[] args) {

        Task_13 myObj = new Task_13();

       Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = input.nextInt();

        myObj.Son(a);
    }

}
