package Java_Tasks;

import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nechta son :");
        int n = input.nextInt();

        int[] arr = new int[n];

        int sum = 0;
        int max = 0;
        int min = 0;
        int juft = 0;
        int toq = 0;

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + " son :");

            arr[i] = input.nextInt();

            sum += arr[i];

            if (i == 0) {
                max = arr[i];
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] % 2 == 0) {
                juft++;
            } else {
                toq++;
            }
        }
        double orta = (double) sum / n;
        System.out.println("Yig'indi: " + sum);
        System.out.println("O'rtacha: " + orta);
        System.out.println("Maksimum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Juftlar soni: " + juft);
        System.out.println("Toqlar soni: " + toq);
    }
}
