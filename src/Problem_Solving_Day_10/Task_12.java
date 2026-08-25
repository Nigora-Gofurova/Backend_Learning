package Problem_Solving_Day_10;

import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
       class_10 obj = new class_10();
        Scanner input = new Scanner(System.in);
        System.out.print("S kiriting: ");
        int S = input.nextInt();
        System.out.print("N kiriting: ");
        int N = input.nextInt();
        obj.sDarajaHisoblash(S, N);
    }
}
