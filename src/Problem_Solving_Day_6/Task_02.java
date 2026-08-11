package Problem_Solving_Day_6;

import java.util.Scanner;

public class Task_02 {
    public void kopaytma() {

       Scanner input = new Scanner(System.in);

        int natija = 1;
        int son = 1;

        while (son != 0) {

            System.out.print("Son kiriting: ");
            son = input.nextInt();

            if (son != 0) {
                natija = natija * son;
            }
        }

        System.out.print(natija);
    }

    public static void main(String[] args) {

        Task_02 obj = new Task_02();

        obj.kopaytma();
    }
}
