package Problem_Solving_Day_13;

import java.util.Scanner;

public class Task_05 {
    public static void main(String[] args) {
        class_13 obj = new class_13();
        Scanner input = new Scanner(System.in);
        System.out.print("S kiriting: ");
        int S = input.nextInt();
        System.out.print("N kiriting: ");
        int N = input.nextInt();
        int natija = obj.daraja(S, N);
        System.out.println(S + " ning " + N + "-darajasi: " + natija);
    }
}