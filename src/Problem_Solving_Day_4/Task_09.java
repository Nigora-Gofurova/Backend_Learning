package Problem_Solving_Day_4;

import java.util.Scanner;

public class Task_09 {
    public void Sonlar(int a, int b, int c) {


        if (a >= b && b >= c) {
            System.out.print(a + " " + b);

        } else if (a >= c && c >= b) {
            System.out.print(a + " " + c);

        } else if (b >= a && a >= c) {
            System.out.print(b + " " + a);

        } else if (b >= c && c >= a) {
            System.out.print(b + " " + c);

        } else if (c >= a && a >= b) {
            System.out.print(c + " " + a);

        } else {
            System.out.print(c + " " + b);
        }
    }

    public static void main(String[] args) {

        Task_09 myObj = new Task_09();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = input.nextInt();

        System.out.print("Enter b number: ");
        int b = input.nextInt();

        System.out.print("Enter c number: ");
        int c = input.nextInt();

        myObj.Sonlar(a, b, c);
    }
}
