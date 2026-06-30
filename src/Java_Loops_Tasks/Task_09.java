package Java_Loops_Tasks;

import java.util.Scanner;

public class Task_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a ni kiriting : ");
        int a = input.nextInt();

        System.out.print("b ni kiriting : ");
        int b = input.nextInt();

        int sum = 0;
        int kopaytma = 1;

        for (int i = a + 1; i < b; i++) {

            if (i % 2 == 0) {
                sum += i;
            }

            if (i % 2 != 0) {
                kopaytma *= i;
            }
        }

        System.out.println("Juft sonlar yig'indisi : " + sum);
        System.out.println("Toq sonlar ko'paytmasi : " + kopaytma);
    }
}
