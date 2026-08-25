package Problem_Solving_Day_10;

import java.util.Scanner;

public class Task_07 {
    public static void main(String[] args) {
        class_10 obj = new class_10();
       Scanner input = new Scanner(System.in);
        System.out.print("Parol kiriting: ");
        String parol = input.nextLine();
        obj.parolTekshirish(parol);
    }
}
