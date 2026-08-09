package Learning_Java;

import java.util.Scanner;

public class Mantiqiy_Aperatorlar {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Yoshingizni kiriting :");
        int Yosh=input.nextInt();

        if(Yosh>0 && Yosh<=7){
            System.out.print("Siz bog'cha yoshidasiz ");
        }else if(Yosh>=8 && Yosh<=16){
            System.out.print("Siz maktab yoshidasiz ");
        }else if (Yosh>=17 && Yosh<=18){
            System.out.print("Siz kallej yoshidasiz ");
        }else{
            System.out.print("notogri yosh  ");
        }
    }
}
