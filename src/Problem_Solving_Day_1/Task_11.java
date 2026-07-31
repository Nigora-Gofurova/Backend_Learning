package Problem_Solving_Day_1;

import java.util.Scanner;

public class Task_11 {
    public static void metrga_otqazish(int L){
        System.out.print(L/100);
    }
    public static void main(String[] args) {

        Task_11 MyObj = new Task_11();

        Scanner input = new Scanner(System.in);

        System.out.print("santimetrni kiritng :");
        int kiritng = input.nextInt();

        MyObj.metrga_otqazish(kiritng);
    }
}
