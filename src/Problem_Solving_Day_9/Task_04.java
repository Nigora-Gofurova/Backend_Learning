package Problem_Solving_Day_9;

import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args ) {
       Scanner input = new Scanner(System.in);
        int soni = 0;
        System.out.print("Sonlarni kiriting manfiy son kelguncha :");
        while (true) {
            int son = input.nextInt();
            if (son < 0) break;
            soni++;
        }
        System.out.print("Musbat sonlar soni: " + soni);
    }
}
