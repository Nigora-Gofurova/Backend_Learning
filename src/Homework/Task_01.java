package Homework;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" svetafor rangini kiriting :");
        String rang=input.nextLine();

        String natija ="";

        switch(rang){
            case "Qizil":
                natija="Toxta";
                break;
            case "Sariq":
                natija="Tayyorlan";
                break;
            case "Yashil":
                natija="Yur";
                break;
            default:
                natija="svetafor rangida bunday rang mavjud emas";
                break;
        }
        System.out.println("Natija: "+natija);
    }
}
