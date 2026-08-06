package Problem_Solving_Day_2;

import java.util.Scanner;

public class Task_08 {

    public void time(double s) {

        double result = s / 7;

        System.out.println(result);

    }

    public static void main(String[] args) {

        Task_08 myObj = new Task_08();

        Scanner sc = new Scanner(System.in);

        System.out.print("Masofani kiriting: ");
        double s = sc.nextDouble();

        myObj.time(s);

    }

}
