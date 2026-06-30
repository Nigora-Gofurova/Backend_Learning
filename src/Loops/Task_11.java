package Loops;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {


        for (int son = 10; son <= 99; son++) {
            int birlik = son % 10;
            int onlik = son / 10;

            if (onlik == 8 || birlik == 8) {
                System.out.println(son);
            }
        }
    }
}
