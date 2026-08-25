package Problem_Solving_Day_10;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        class_10 obj = new class_10();
        Scanner input = new Scanner(System.in);

        System.out.print("N kiriting kvadrat son tekshirish uchun: ");
        int N = input.nextInt();
        obj.kvadratSonmi(N);

        input.nextLine();
        System.out.print("Satr kiriting (harf bo'lmagan belgilar uchun): ");
        String str = input.nextLine();
        obj.harfBolmaganBelgilar(str);
    }
}
