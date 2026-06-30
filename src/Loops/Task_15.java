package Loops;

import java.util.Scanner;

public class Task_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int son = 100; son <= 999; son++) {
            int birlik = son % 10;
            int onlik = (son / 10) % 10;
            int yuzlik = son / 100;

            int sum = yuzlik + onlik + birlik;

            if (sum == 20) {
                System.out.println(son);
            }
        }
    }
}
