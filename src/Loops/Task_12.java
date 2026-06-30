package Loops;

import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int son = 100; son <= 999; son++) {
            int onlik = (son / 10) % 10;

            if (onlik == 7) {
                System.out.println(son);
            }
        }
    }
}
