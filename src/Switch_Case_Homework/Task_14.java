package Switch_Case_Homework;

import java.util.Scanner;

public class Task_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("oy tartib raqamini kiritng :");
        int raqam = input.nextInt();

        switch (raqam) {
            case 1:
                System.out.print(" 14-yanvar vatan himoyachilar kuni ");
                break;
            case 2:
                System.out.print(" 14-fevral Zahiriddin Muhammad Boburni tugulgan kun ");
                break;
            case 3:
                System.out.println(" 8-mart Xalqaro xotin-qizlar kuni ");
                System.out.print(" 21-Mart navroz bayrami ");
                break;
            case 4:
                System.out.print(" 1-aprel hazil kuni  ");
                break;
            case 5:
                System.out.print("9- May xotira va qadirlash kuni ");
                break;
            case 6:
                System.out.println(" 1-iyun bolalar kuni");
                System.out.print("30-iyun yoshlar kuni ");
                break;
            case 9:
                System.out.print(" 1-sentyabr mustaqillik kuni ");
                break;
            case 10:
                System.out.println(" 1- oktyabr O'qituvchi va murabbiylar kuni ");
                break;
            case 12:
                System.out.println("8- dekabr Kansitutsiya kuni ");
                break;
            case 7:
            case 8:
            case 11:
                System.out.println("Bu oyda  bayramlar yo'q ");
                break;
            default:
                System.out.println("XATO ");
                break;
        }
    }
}
