package Problem_Solving_Day_2;

import java.util.Scanner;

public class Task_11 {
    public void hour(int second) {

        int hour = second / 3600;

        System.out.println(hour);

    }

    public static void main(String[] args) {

        Task_11 myObj = new Task_11();

    Scanner sc = new Scanner(System.in);

        System.out.print("Sekund kiriting: ");
        int second = sc.nextInt();

        myObj.hour(second);

    }
}