package Problem_Solving_Day_1;

import java.util.Scanner;

public class Task_01 {
    static void orta_arifmetik(double a,double b, double c){
        System.out.print ((a+b+c)/3) ;
    }
    public static void main(String[] args) {

        Task_01 myObj = new Task_01();

        Scanner input= new Scanner(System.in);

        System.out.print("a sonini kiriting :");
        int a=input.nextInt();

        System.out.print("b sonini kiriting :");
        int b=input.nextInt();

        System.out.print("c sonini kiriting :");
        int c=input.nextInt();

        myObj.orta_arifmetik(a,b,c);
    }
}
