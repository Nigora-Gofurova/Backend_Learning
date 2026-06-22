package Switch_Case_Homework;

import java.util.Scanner;

public class Task_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pin kodni kiriting :");
        int pin = input.nextInt();

        if (pin == 1908) {
            System.out.println("tolovlar :");
            System.out.println("1 Balans :");
            System.out.println("2 Tel uchun to'lov :");
            System.out.println("3 Kommunal to'lov :");
            System.out.print("Xizmatni tanlang 1, 2 yoki 3 :");
            int tolash = input.nextInt();

            switch (tolash) {
                case 1:
                    System.out.print("Sizning balansingiz 500,000 so'm ");
                    break;
                case 2:
                    System.out.print("Telefon uchun to'lov muvaffaqiyatli bajarildi !");
                    break;
                case 3:
                    System.out.print("Kommunal to'lov muvaffaqiyatli bajarildi !");
                    break;
                default:
                    System.out.print("XATO !");
                    break;
            }
        } else {
            System.out.print("XATO ! PIN kod noto'g'ri. Kirish taqiqlandi !");
        }
    }

}
