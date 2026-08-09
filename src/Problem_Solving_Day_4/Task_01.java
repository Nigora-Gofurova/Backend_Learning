package Problem_Solving_Day_4;

import java.util.Scanner;

public class Task_01 {
    public void Katta_Raqam(int raqam){

        int yuz=raqam/100;
        int on=(raqam/10)%10;
        int bir=raqam%10;

        if(yuz>=on && yuz>=bir) {
            System.out.print(yuz);
        }else if(on>=yuz && on>=bir){
            System.out.print(on);
        }else if(bir>=yuz && bir>=on){
            System.out.print(bir);
        }
    }
    public static void main(String[] args) {

        Task_01 myObj = new Task_01();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter raqam number: ");
        int raqam = input.nextInt();

        myObj.Katta_Raqam(raqam);
    }
}

