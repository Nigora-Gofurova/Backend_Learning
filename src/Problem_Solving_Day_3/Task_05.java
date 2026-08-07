package Problem_Solving_Day_3;

import java.util.Scanner;

public class Task_05 {
    public void grade(int ball) {

        if (ball >= 0 && ball <= 54) {
            System.out.println("2 baho");
        } else if (ball >= 55 && ball <= 70) {
            System.out.println("3 baho");
        } else if (ball >= 71 && ball <= 84) {
            System.out.println("4 baho");
        } else if (ball >= 85 && ball <= 100) {
            System.out.println("5 baho");
        } else {
            System.out.println("Noto'g'ri ball kiritildi.");
        }

    }

    public static void main(String[] args) {

        Task_05 myObj = new Task_05();

       Scanner input = new Scanner(System.in);

        System.out.print("Ball kiriting: ");
        int ball = input.nextInt();

        myObj.grade(ball);

    }
}
