package Problem_Solving_Day_6;

import java.util.Scanner;

public class Task_13 {
    public void ildiz(int n) {

        for (int i = 0; i <= n; i++) {

            for (int j = 0; j <= i; j++) {

                if (j * j == i) {
                    System.out.println(i + " ning ildizi = " + j);
                }
            }
        }
    }

    public static void main(String[] args) {

        Task_13 obj = new Task_13();

        Scanner input = new Scanner(System.in);

        System.out.print("N ni kiriting: ");
        int n = input.nextInt();

        obj.ildiz(n);
    }
}
