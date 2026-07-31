package Problem_Solving_Day_1;

import java.util.Scanner;

public class Task_05 {
    public  static void qiymatlar_almashuvi(int a,int b,int c,int temp){
        a=b;
        b=c;
        c=temp;
        temp=a;
        a=b;
        b=c;
        System.out.println("a="+a+" b="+b+" c="+temp);
    }
    public static void main(String[] args) {

        Task_05 MyObj = new Task_05();

        Scanner input = new Scanner(System.in);

        System.out.print("a sonini kiriting :");
        int a=input.nextInt();
        System.out.print("b sonini kiriting :");
        int b=input.nextInt();
        System.out.print("c sonini kiriting :");
        int c=input.nextInt();

        MyObj.qiymatlar_almashuvi(a,b,c,a);
    }
}
