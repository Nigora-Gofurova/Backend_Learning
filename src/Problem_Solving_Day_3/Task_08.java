package Problem_Solving_Day_3;

import java.util.Scanner;

public class Task_08 {
    public void hasThree(int son) {

        int ming = son / 1000;
        int bir = son % 10;

        if (ming == 3 || bir == 3) {
            System.out.println("ishtirok etgan");
        } else {
            System.out.println("ishtirok etmagan");
        }

    }

    public static void main(String[] args) {

        Task_08 myObj = new Task_08();

        Scanner input = new Scanner(System.in);

        System.out.print("4 xonali son kiriting: ");
        int son = input.nextInt();

        myObj.hasThree(son);

    }
}
