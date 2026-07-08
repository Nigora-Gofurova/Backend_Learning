package Java_Tasks;

import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Talabalar soni  :");
        int n = input.nextInt();

        int[] ball = new int[n];

        int sum = 0;
        int max = 0;
        int min = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Ball " + (i + 1) + ": ");
            ball[i] = input.nextInt();

            sum += ball[i];

            if (i == 0) {
                max = ball[i];
                min = ball[i];
            }

            if (ball[i] > max) {
                max = ball[i];
            }

            if (ball[i] < min) {
                min = ball[i];
            }
        }

        double orta = (double) sum / n;

        System.out.println("O'rtacha: " + orta);
        System.out.println("Maksimum: " + max);
        System.out.println("Minimum: " + min);

        System.out.println("O'rtachadan yuqori ballar :");

        for (int i = 0; i < n; i++) {
            if (ball[i] > orta) {
                System.out.println(ball[i]);
            }
        }
    }
}
