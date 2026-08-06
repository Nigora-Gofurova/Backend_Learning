package Problem_Solving_Day_2;

import java.util.Scanner;

public class Task_02 {
    public void kiloByte(int bayt){

        int kb = bayt / 1024;

        System.out.println(kb);

    }

    public static void main(String[] args){

        Task_02 myObj = new Task_02();

        Scanner input = new Scanner(System.in);

        System.out.print("Bayt kiriting: ");
        int bayt = input.nextInt();

        myObj.kiloByte(bayt);

    }
}
