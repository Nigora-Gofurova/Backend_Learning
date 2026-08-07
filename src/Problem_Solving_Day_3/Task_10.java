package Problem_Solving_Day_3;

import java.util.Scanner;

public class Task_10 {
    public void number(int son) {

        if (son > 0) {
            System.out.println(son + 1);
        } else if (son < 0) {
            System.out.println(Math.abs(son) + 2);
        } else {
            System.out.println(100);
        }

    }

    public static void main(String[] args) {

        Task_10 myObj = new Task_10();

        Scanner input = new Scanner(System.in);

        System.out.print("Son kiriting: ");
        int son = input.nextInt();

        myObj.number(son);
    }
}
