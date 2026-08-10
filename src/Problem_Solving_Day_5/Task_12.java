package Problem_Solving_Day_5;

import java.util.Scanner;

public class Task_12 {
    public void daraja(int n, int a) {

        int natija = 1;

        for (int i = 1; i <= n; i++) {
            natija = natija * a;
        }

        System.out.print(natija);
    }

    public static void main(String[] args) {

        Task_12 obj = new Task_12();

      Scanner input = new Scanner(System.in);

        System.out.print("n ni kiriting: ");
        int n = input.nextInt();

        System.out.print("a ni kiriting: ");
        int a = input.nextInt();

        obj.daraja(n, a);
    }
}
