package Problem_Solving_Day_1;

import java.util.Scanner;

public class Task_09 {
    public static void onlar_honasi(int son,int on){
        on=(son/10)%10;
        System.out.println(on);
    }
    public static void main(String[] args) {
        Task_09 MyObj=new Task_09();
        Scanner input=new Scanner(System.in);
        System.out.print("4 honalik raqam kiriting :");
        int raqam=input.nextInt();

        MyObj.onlar_honasi(raqam,1);
    }
}
