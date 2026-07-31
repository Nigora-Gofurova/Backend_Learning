package Problem_Solving_Day_1;

import java.util.Scanner;

public class Task_13 {
    public  static void almashtirish(int son){
        int yuz = son / 100;
        int qolgan = son % 100;
        int natija = qolgan * 10 + yuz;
        System.out.println(natija);
    }
    public static void main(String[] args) {
        Task_13 MyObj = new Task_13();
        Scanner input = new Scanner(System.in);
        System.out.println("3 honalik raqam kiriting :");
        int son = input.nextInt();

        MyObj.almashtirish(son);
    }
}
