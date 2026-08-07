package Problem_Solving_Day_3;

import java.util.Scanner;

public class Task_07 {
    public void sumNumbers(int a, int b) {

        int sum = a + b;

        if (sum >= 10 && sum <= 19) {
            System.out.println(20);
        } else {
            System.out.println(sum);
        }

    }

    public static void main(String[] args) {

        Task_07 myObj = new Task_07();

      Scanner input = new Scanner(System.in);

        System.out.print("a = ");
        int a = input.nextInt();

        System.out.print("b = ");
        int b = input.nextInt();

        myObj.sumNumbers(a, b);

    }
}
