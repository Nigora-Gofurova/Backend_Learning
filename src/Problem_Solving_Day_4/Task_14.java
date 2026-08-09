package Problem_Solving_Day_4;

import java.util.Scanner;

public class Task_14 {
    public void Sonlar(int a, int b, int c) {

        int sanoq = 0;

        if (a > 0) {
            sanoq = sanoq + 1;
        }

        if (b > 0) {
            sanoq = sanoq + 1;
        }

        if (c > 0) {
            sanoq = sanoq + 1;
        }

        System.out.print(sanoq);
    }

    public static void main(String[] args) {

        Task_14 myObj = new Task_14();

        Scanner input = new Scanner(System.in);

        System.out.print("a = ");
        int a = input.nextInt();

        System.out.print("b = ");
        int b = input.nextInt();

        System.out.print("c = ");
        int c = input.nextInt();

        myObj.Sonlar(a, b, c);
    }
}
