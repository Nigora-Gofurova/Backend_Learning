package Problem_Solving_Day_4;

import java.util.Scanner;

public class Task_15 {

    public void Sonlar(int a, int b) {

        if (a > b) {
            System.out.print(a + " " + b);

        } else {
            System.out.print(b + " " + a);
        }
    }

    public static void main(String[] args) {

        Task_15 myObj = new Task_15();

        Scanner input = new Scanner(System.in);

        System.out.print("a = ");
        int a = input.nextInt();

        System.out.print("b = ");
        int b = input.nextInt();

        myObj.Sonlar(a, b);
    }

}
