package Problem_Solving_Day_2;

import java.util.Scanner;

public class Task_07 {
    public void minute(int a, int b) {

        int result = (a * 24 + b) * 60;

        System.out.println(result);

    }

    public static void main(String[] args) {

        Task_07 myObj = new Task_07();

       Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();

        System.out.print("b = ");
        int b = sc.nextInt();

        myObj.minute(a, b);

    }

}
