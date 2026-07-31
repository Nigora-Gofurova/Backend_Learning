package Problem_Solving_Day_1;

import java.util.Scanner;

public class Task_15 {
    public static void kopaytirish(int son){
        int ming = son / 1000;
        int yuz = (son / 100) % 10;
        int on = (son / 10) % 10;
        int bir = son % 10;

        int natija = ming * yuz * on * bir;
        System.out.println(natija);
    }
    public static void main(String[] args) {
        Task_15 MyObj = new Task_15();
        Scanner input = new Scanner(System.in);
        System.out.print("son kiriting :");
        int son = input.nextInt();

        MyObj.kopaytirish(son);
    }
}
