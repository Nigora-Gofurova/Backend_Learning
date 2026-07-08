package Array_code_with_definition;

import java.util.Scanner;

public class problem_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nechta element kiritasiz : ");
        int n = input.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i +  " son :");
            arr[i] = input.nextInt();
        }
        int sum = 0;

        for (int i = 0; i < 2; i++) {
            sum += arr[i];
        }
        for (int i = arr.length - 3; i < arr.length; i++) {       // massivni  ohirini aylantiramiz bu yerda ohirgisini
            sum += arr[i];
        }
        System.out.println("Yig'indi = " + sum);

    }
}
