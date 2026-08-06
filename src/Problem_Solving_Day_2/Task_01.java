package Problem_Solving_Day_2;

import java.util.Scanner;

public class Task_01 {
    public void sumDigits(int son){

        int yuz = son / 100;
        int on = son / 10 % 10;
        int bir = son % 10;

        System.out.println(yuz + on + bir);

    }

    public static void main(String[] args){

        Task_01 myObj = new Task_01();

       Scanner input = new Scanner(System.in);

        System.out.print("Son kiriting: ");
        int son = input.nextInt();

        myObj.sumDigits(son);

    }

}
