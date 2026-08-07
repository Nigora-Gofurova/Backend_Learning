package Problem_Solving_Day_3;

import java.util.Scanner;

public class Task_14 {
    public void check(int son) {

        int yuz = son / 100;
        int on = son / 10 % 10;
        int bir = son % 10;

        if (yuz < on && on < bir) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

    public static void main(String[] args) {

        Task_14 myObj = new Task_14();

        Scanner input = new Scanner(System.in);

        System.out.print("Son kiriting: ");
        int son = input.nextInt();

        myObj.check(son);

    }

}
