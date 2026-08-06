package Problem_Solving_Day_2;

import java.util.Scanner;

public class Task_14 {
    public void length(double r) {

        double pi = 3.14;

        double l = 2 * pi * r;

        System.out.println(l);

    }

    public static void main(String[] args) {

        Task_14 myObj = new Task_14();

       Scanner sc = new Scanner(System.in);

        System.out.print("Radius kiriting: ");
        double r = sc.nextDouble();

        myObj.length(r);

    }
}
