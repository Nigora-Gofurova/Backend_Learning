package Problem_Solving_Day_2;

import java.util.Scanner;

public class Task_10 {
    public static void second(double gb) {

        double kb = gb * 1024 * 1024;

        double result = kb / 750;

        System.out.println(result);

    }

    public static void main(String[] args) {

        Task_10 myObj = new Task_10();

       Scanner sc = new Scanner(System.in);

        System.out.print("GB kiriting: ");
        double gb = sc.nextDouble();

        myObj.second(gb);
    }
}