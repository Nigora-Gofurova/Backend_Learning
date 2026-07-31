package Problem_Solving_Day_1;

import java.util.Scanner;

public class Task_04 {
    public static void Hajm(int a){
        System.out.println("V= "+a*a*a);
        System.out.println("S= "+6*a*a);
    }
    public static void main(String[] args) {
        Task_04 MyObj = new Task_04();

        Scanner input = new Scanner(System.in);

        System.out.print("a sonini kiriting :");
        int a=input.nextInt();

        MyObj.Hajm(a);
    }
}
