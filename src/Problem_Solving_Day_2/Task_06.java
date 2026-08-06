package Problem_Solving_Day_2;

import java.util.Scanner;

public class Task_06 {
    public void change(int son){

        int yuz = son / 100;
        int on = son / 10 % 10;
        int bir = son % 10;

        int result = bir * 100 + yuz * 10 + on;

        System.out.println(result);

    }

    public static void main(String[] args){

        Task_06 myObj = new Task_06();

        Scanner sc = new Scanner(System.in);

        System.out.print("Son kiriting: ");
        int son = sc.nextInt();

        myObj.change(son);

    }
}
