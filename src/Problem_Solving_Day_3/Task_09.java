package Problem_Solving_Day_3;

import java.util.Scanner;

public class Task_09 {
    public void number(int son) {

        if (son > 0) {
            System.out.println(son * 15);
        } else if (son < 0) {
            System.out.println(Math.abs(son));
        } else {
            System.out.println(son);
        }

    }

    public static void main(String[] args) {

        Task_09 myObj = new Task_09();

        Scanner input = new Scanner(System.in);

        System.out.print("Son kiriting: ");
        int son = input.nextInt();

        myObj.number(son);

    }

}
