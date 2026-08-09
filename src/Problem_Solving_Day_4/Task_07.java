package Problem_Solving_Day_4;

import java.util.Scanner;

public class Task_07 {
    public void Asr(int yil) {

        if (yil % 100 == 0) {
            System.out.print(yil / 100);
        } else {
            System.out.print(yil / 100 + 1);
        }
    }

    public static void main(String[] args) {

        Task_07 myObj = new Task_07();

       Scanner input = new Scanner(System.in);

        System.out.print("Enter yil: ");
        int yil = input.nextInt();

        myObj.Asr(yil);
    }
}
