package Problem_Solving_Day_3;

import java.util.Scanner;

public class Task_02 {
    public void hasThree(int son) {

        int ming = son / 1000;
        int yuz = son / 100 % 10;
        int on = son / 10 % 10;
        int bir = son % 10;

        if (ming == 3 || yuz == 3 || on == 3 || bir == 3) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

    public static void main(String[] args) {

        Task_02 myObj = new Task_02();

       Scanner input = new Scanner(System.in);

        System.out.print("4 xonali son kiriting: ");
        int son = input.nextInt();

        myObj.hasThree(son);

    }
}
