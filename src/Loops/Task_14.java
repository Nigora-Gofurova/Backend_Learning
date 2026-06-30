package Loops;

import java.util.Scanner;

public class Task_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int son = 10; son <= 99; son++) {
            int birlik = son % 10;
            int onlik = son / 10;
            int sum = onlik + birlik;

            if (sum == 9 || sum == 15) {
                System.out.println(son);
            }
        }
    }
}
