package Java_Loops_Tasks;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Son kiriting: ");
        int n = input.nextInt();

        for (int raqam = 1; raqam <= n; raqam++) {
            if (n % raqam == 0) {
                System.out.println(raqam);
            }
        }
    }
}
