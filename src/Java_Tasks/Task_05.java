package Java_Tasks;

import java.util.Scanner;

public class Task_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nechta son :");
        int n = input.nextInt();

        int[] arr = new int[n];
        int[] teskari = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + "-son: ");
            arr[i] = input.nextInt();
        }
        int j = n - 1;

        for (int i = 0; i < n; i++) {
            teskari[i] = arr[j];
            j--;
        }
        System.out.println("Teskari massiv:");

        for (int i = 0; i < n; i++) {
            System.out.print(teskari[i] + " ");
        }
    }
}
