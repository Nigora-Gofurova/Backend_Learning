package Problem_Solving_Day_1;

import java.util.Scanner;

public class Task_14 {
    public static void teskari_son_oqiw(int son){
        int yuz = son / 100;
        int on = (son / 10) % 10;
        int bir = son % 10;

        int natija = bir * 100 + on * 10 + yuz;
        System.out.println(natija);
    }
    public static void main(String[] args) {
        Task_14 MyObj = new Task_14();
        Scanner input = new Scanner(System.in);
        System.out.print("3 hoanlik son kiriting :");
        int son = input.nextInt();

        MyObj.teskari_son_oqiw(son);
    }
}
