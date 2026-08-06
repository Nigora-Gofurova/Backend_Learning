package Problem_Solving_Day_2;

import java.util.Scanner;

public class Task_09 {
    public void hour(int a, int b) {

        int result = (a * 7 + b) * 24;

        System.out.println(result);

    }

    public static void main(String[] args) {

        Task_09 myObj = new Task_09();

     Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        int a = input.nextInt();

        System.out.print("b = ");
        int b = input.nextInt();

        myObj.hour(a, b);

    }
}