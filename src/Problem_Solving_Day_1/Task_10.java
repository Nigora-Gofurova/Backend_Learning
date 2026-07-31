package Problem_Solving_Day_1;

import java.util.Scanner;

public class Task_10 {
    public static void a_7_darajasi(int a,int a2,int a3,int a6,int a7){
        a2 = a * a;
        a3 = a2 * a;
        a6 = a3 * a3;
        a7 = a6 * a;
        System.out.println(a7);
    }
    public static void main(String[] args) {
        Task_10 MyObj=new Task_10();
        Scanner input = new Scanner(System.in);
        System.out.print("lubboy raqamini kirit 7 darajasini chiqarberaman :");
        int raqam=input.nextInt();

        MyObj.a_7_darajasi(raqam,1,1,1,1);
    }
}
