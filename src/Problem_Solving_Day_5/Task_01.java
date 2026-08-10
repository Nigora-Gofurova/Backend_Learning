package Problem_Solving_Day_5;

import java.util.Scanner;

public class Task_01 {
    public void son(int a) {

        if (a >= 1 && a <= 9) {

            if (a % 2 == 0) {
                System.out.print("bir xonali juft son");
            } else {
                System.out.print("bir xonali toq son");
            }

        } else if (a >= 10 && a <= 99) {

            if (a % 2 == 0) {
                System.out.print("ikki xonali juft son");
            } else {
                System.out.print("ikki xonali toq son");
            }

        } else if (a >= 100 && a <= 999) {

            if (a % 2 == 0) {
                System.out.print("uch xonali juft son");
            } else {
                System.out.print("uch xonali toq son");
            }

        } else {
            System.out.print("xato son");
        }
    }

    public static void main(String[] args) {

        Task_01 obj = new Task_01();

      Scanner input = new Scanner(System.in);

        System.out.print("Son kiriting: ");
        int a = input.nextInt();

        obj.son(a);
    }
}
