package OOP_Tasks;

import java.util.Scanner;

public class Kinoteatr_run {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("joy nechta kerak :");
        int joy =Integer.parseInt(input.nextLine());

        System.out.print("film nomi :");
        String film = input.nextLine();


        System.out.println("joy :"+joy);
        System.out.println("film nomi :"+film);

        Kinoteatr kinoteatr = new Kinoteatr(joy,film);

        System.out.print("\n nechta chipta sotip olasiz :");
        int sotipOlish =Integer.parseInt(input.nextLine());


        System.out.println("chipta " + kinoteatr.getTicket());
        System.out.println("umumiy summa " + kinoteatr.totalPrice(sotipOlish));


    }
}
