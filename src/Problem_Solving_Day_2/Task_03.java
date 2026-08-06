package Problem_Solving_Day_2;

import java.util.Scanner;

public class Task_03 {

    public void time(int sekund){

        int soat = sekund / 3600;

        int minut = (sekund % 3600) / 60;

        System.out.println(soat + " soat " + minut + " minut");

    }

    public static void main(String[] args){

        Task_03 myObj = new Task_03();

    Scanner sc = new Scanner(System.in);

        System.out.print("Sekund kiriting: ");
        int sekund = sc.nextInt();

        myObj.time(sekund);

    }

}
