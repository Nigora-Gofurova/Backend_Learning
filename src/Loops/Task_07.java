package Loops;

import java.util.Scanner;

public class Task_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n ni kiriting: ");
        int n = input.nextInt();

        int daraja = 1;

        while (daraja < n) {
            daraja = daraja * 3;
        }

        if (daraja == n) {
            System.out.println("3 ning darajasi");
        } else {
            System.out.println("3 ning darajasi emas");
        }
    }
}
