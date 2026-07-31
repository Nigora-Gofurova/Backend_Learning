package Problem_Solving_Day_1;

import java.util.Scanner;

public class Task_07 {
    public static void som_valyuta(double som){
        double doller=som/11200;

        System.out.println("doller "+doller);
    }
    public static void main(String[] args) {

        Task_07 MyObj=new Task_07();

        Scanner input=new Scanner(System.in);

        System.out.print("somni kiriting :");
        double som=input.nextInt();

        MyObj.som_valyuta(som);
    }
}
