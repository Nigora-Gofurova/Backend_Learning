package Problem_Solving_Day_4;

import java.util.Scanner;

public class Task_03 {
    public void sonlarni_mantigi(int a, int b, int c) {
        int count = 0;

        if (a > 0) {
            count++;
        }
        if (b > 0) {
            count++;
        }
        if (c > 0) {
            count++;
        }
        if (count ==2) {
            System.out.print(a+b+c);
        }else{
            System.out.print(a*b*c);
        }
    }
    public static void main(String[] args) {

        Task_03 obj = new Task_03();

        Scanner input = new Scanner(System.in);

        System.out.print("a raqam kiritng :");
        int a = input.nextInt();
        System.out.print("b raqam kiritng :");
        int b = input.nextInt();
        System.out.print("c raqam kiritng :");
        int c = input.nextInt();

        obj.sonlarni_mantigi(a,b,c);
    }
}