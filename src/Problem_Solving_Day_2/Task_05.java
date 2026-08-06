package Problem_Solving_Day_2;

import java.util.Scanner;

public class Task_05 {
    public void hundred(int son){

        int yuz = son / 100 % 10;

        System.out.println(yuz);

    }

    public static void main(String[] args){

        Task_05 myObj = new Task_05();

       Scanner sc = new Scanner(System.in);

        System.out.print("Son kiriting: ");
        int son = sc.nextInt();

        myObj.hundred(son);

    }
}
