package Problem_Solving_Day_3;

import java.util.Scanner;

public class Task_01 {
    public void swapDigits(int son) {

        int yuz = son / 100;
        int on = son / 10 % 10;
        int bir = son % 10;

        int natija = on * 100 + yuz * 10 + bir;

        System.out.println(natija);

    }

    public static void main(String[] args) {

        Task_01 myObj = new Task_01();

        Scanner input = new Scanner(System.in);

        System.out.print("Son kiriting: ");
        int son = input.nextInt();

        myObj.swapDigits(son);

    }
}
