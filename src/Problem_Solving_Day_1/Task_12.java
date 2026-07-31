package Problem_Solving_Day_1;

import java.util.Scanner;

public class Task_12 {
    public static void yuzlar_honasi(int yuz){
        yuz=(yuz/100)%10;
        System.out.println(yuz);
    }
    public static void main(String[] args) {

        Task_12 MyObj = new Task_12();

        Scanner input = new Scanner(System.in);

        System.out.print("raqamlar kiriting faqat 3 honalikdan kam bolmasin :");
        int son = input.nextInt();

        MyObj.yuzlar_honasi(son);
    }
}
