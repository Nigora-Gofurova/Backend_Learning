package Problem_Solving_Day_12;

import java.util.Scanner;

public class Task_07 {
    public static void main(String[] args) {
        class_12 obj = new class_12();
        Scanner input = new Scanner(System.in);
        System.out.print("N kiriting: ");
        int n = input.nextInt();
        obj.kvadratSonmi(n);
        obj.toqRaqamliSonlar200_800();
    }
}