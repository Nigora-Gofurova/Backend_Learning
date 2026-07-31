package Problem_Solving_Day_1;

import java.util.Scanner;

public class Task_06 {
    public static void kvadrat(int a){
        System.out.println(a*a);
    }
    public static void main(String[] args) {
        Task_06 MyObj=new Task_06();

        Scanner input=new Scanner(System.in);

        System.out.print("a sonin kiriting :");
        int a=input.nextInt();

        MyObj.kvadrat(a);
    }
}
