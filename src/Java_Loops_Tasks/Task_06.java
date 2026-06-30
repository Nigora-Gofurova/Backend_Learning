package Java_Loops_Tasks;

import java.util.Scanner;

public class Task_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a sonini kiriting :");
        int a = input.nextInt();
        System.out.print("b sonini kiriting :");
        int b = input.nextInt();

        int kopaytma = 1;

        for(int i = a; i <= b; i++){
            kopaytma = kopaytma * i;
        }
        System.out.println(kopaytma);
    }
}
