package Problem_Solving_Day_5;

import java.util.Scanner;

public class Task_15 {
    public void daraja(int n) {

        int son = 1;

        while (son < n) {
            son = son * 3;
        }

        if (son == n) {
            System.out.print("3 ning darajasi");
        } else {
            System.out.print("3 ning darajasi emas");
        }
    }

    public static void main(String[] args) {

        Task_15 obj = new Task_15();

       Scanner input = new Scanner(System.in);

        System.out.print("n ni kiriting: ");
        int n = input.nextInt();

        obj.daraja(n);
    }
}
