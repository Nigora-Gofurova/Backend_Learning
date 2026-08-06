package Problem_Solving_Day_2;

import java.util.Scanner;

public class Task_13 {

    public void multiply(int son) {

        int yuz = son / 100;
        int on = son / 10 % 10;
        int bir = son % 10;

        System.out.println(yuz * on * bir);

    }

    public static void main(String[] args) {

        Task_13 myObj = new Task_13();

        Scanner sc = new Scanner(System.in);

        System.out.print("Son kiriting: ");
        int son = sc.nextInt();

        myObj.multiply(son);
    }
}