package Problem_Solving_Day_2;

import java.util.Scanner;

public class Task_04 {
    public void swap(int a,int b){

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

    public static void main(String[] args){

        Task_04 myObj = new Task_04();

       Scanner sc = new Scanner(System.in);

        System.out.print("a = ");
        int a = sc.nextInt();

        System.out.print("b = ");
        int b = sc.nextInt();

        myObj.swap(a,b);

    }
}
