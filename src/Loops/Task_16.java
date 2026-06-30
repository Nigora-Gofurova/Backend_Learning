package Loops;

import java.util.Scanner;

public class Task_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;

        for (int son = 100; son <= 999; son++) {
            if (son % 3 == 0 && son % 5 == 0) {
                count++;
            }
        }
        System.out.println("Jami: " + count);
    }
}
