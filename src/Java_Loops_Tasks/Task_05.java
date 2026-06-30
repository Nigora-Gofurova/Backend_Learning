package Java_Loops_Tasks;

import java.util.Scanner;

public class Task_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a sonini kiriting :");
        int a = input.nextInt();
        System.out.print("b sonini kiriting :");
        int b = input.nextInt();

        int sum = 0;
        for(int i=a;i<=b;i++){
            sum+=i;
        }
        System.out.println(sum);

    }
}
