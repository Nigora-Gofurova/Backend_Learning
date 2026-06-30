package Loops;

import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int son = 100; son <= 999; son++) {
            int birlik = son % 10;
            int yuzlik = son / 100;

            if (birlik == yuzlik) {
                System.out.println(son);
            }
        }
    }
}
