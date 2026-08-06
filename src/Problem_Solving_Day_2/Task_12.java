package Problem_Solving_Day_2;

import java.util.Scanner;

public class Task_12 {
    public void time(int second) {

        int day = second / 86400;

        second = second % 86400;

        int hour = second / 3600;

        second = second % 3600;

        int minute = second / 60;

        second = second % 60;

        System.out.println(day + " kun");
        System.out.println(hour + " soat");
        System.out.println(minute + " minut");
        System.out.println(second + " sekund");

    }

    public static void main(String[] args) {

        Task_12 myObj = new Task_12();

        Scanner sc = new Scanner(System.in);

        System.out.print("Sekund kiriting: ");
        int second = sc.nextInt();

        myObj.time(second);
    }
}