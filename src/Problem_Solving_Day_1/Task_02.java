package Problem_Solving_Day_1;

import java.util.Scanner;

public class Task_02 {
    public static void kvadratni_tomoni(int P,int a){

        System.out.print(P = 4 * a );
    }
    public static void main(String[] args) {

        Task_02 MyObj = new Task_02();

        Scanner input = new Scanner(System.in);
        System.out.print("peremetrini kiriting :");
        int P=input.nextInt();
        System.out.print("a sonini kiriting :");
        int a=input.nextInt();

        MyObj.kvadratni_tomoni(P,a);

    }
}
