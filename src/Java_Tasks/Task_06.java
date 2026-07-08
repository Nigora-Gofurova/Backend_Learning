package Java_Tasks;

import java.util.Scanner;

public class Task_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nechta son :");
        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + " son :");
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < n / 2; i++) {

            int temp = arr[i];
            arr[i] = arr[n - 1];
            arr[n - 1 - i] = temp;
        }

        System.out.println("Teskari massiv :");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
