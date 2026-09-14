package OOP_Tasks;

import java.util.Scanner;

public class Bank_System_run {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("hisob raqamni kiriting :");
        String hisobRaqam = input.nextLine();

        System.out.print(" eganing ismini  kiriting :");
        String eganing_ismini_Kiriting = input.nextLine();

        Bank_Accaunt bank_accaunt=new Bank_Accaunt(hisobRaqam,eganing_ismini_Kiriting);

        System.out.println("qancha pul qoyasiz :");
        double depozit=Double.parseDouble( input.nextLine());

        System.out.println(" qancha pul olasiz :");
        double withdraw=Double.parseDouble( input.nextLine());

        System.out.println("\n  ega haqida malumot ");
        System.out.println("hisob raqam :" +hisobRaqam);
        System.out.println("owner :"+eganing_ismini_Kiriting);
    }
}
