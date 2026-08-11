package Problem_Solving_Day_6;

import java.util.Scanner;

public class Task_14 {
    public void kopaytma(int a, int b) {

        int natija = 1;

        for (int i = a; i <= b; i++) {

            natija = natija * i;
        }

        System.out.print(natija);
    }

    public static void main(String[] args) {

        Task_14 obj = new Task_14();

       Scanner input = new Scanner(System.in);

        System.out.print("a ni kiriting: ");
        int a = input.nextInt();

        System.out.print("b ni kiriting: ");
        int b = input.nextInt();

        obj.kopaytma(a, b);
    }
}

