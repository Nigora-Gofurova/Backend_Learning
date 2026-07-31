package Problem_Solving_Day_1;

import java.util.Scanner;

public class Task_08 {
    public static void kopaytma_aniqlovchi(int son,int on,int ming,int natija){
        ming = son / 1000;
        on = (son / 10) % 10;
        natija = ming*on;
        System.out.println(natija);
    }
    public static void main(String[] args) {
        Task_08 MyObj=new Task_08();

        Scanner input=new Scanner(System.in);

        System.out.print("4 honalik raqam kiriting :");
        int raqam=input.nextInt();

        MyObj.kopaytma_aniqlovchi(raqam,0,0,0);
    }
}
