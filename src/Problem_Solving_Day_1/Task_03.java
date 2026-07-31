package Problem_Solving_Day_1;

import java.util.Scanner;

public class Task_03 {
    public static void tortburchak_yuzi(int a,int b){
        System.out.println("YUZASI :"+ a*b );
        System.out.println("PEREMETRI :"+2*(a+b) );
    }
    public static void main(String[] args) {
        Task_03 MyObj = new Task_03();

        Scanner input = new Scanner(System.in);
        System.out.print("a sonini kiriting :");
        int a=input.nextInt();
        System.out.print("b sonini kiriting :");
        int b=input.nextInt();

        MyObj.tortburchak_yuzi(a,b);
    }
}
