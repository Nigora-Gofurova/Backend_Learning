package Homework;

import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Vazningizni kiriting :");
        double vazn=input.nextDouble();

        if(vazn<18.5){
            System.out.print("Ozginsiz ");
        }else if(vazn>18.5 && vazn<25){
            System.out.print("Normal holatdasiz ");
        }else if(vazn>25 && vazn<30){
            System.out.print("ortiqcha vazningiz bor ");
        }else{
            System.out.print("semizlik ");
        }
    }
}
