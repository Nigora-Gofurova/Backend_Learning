package Switch_Case_Homework;

import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" 1 sonni kiriting :");
        double son1 = input.nextDouble();

        System.out.print(" amallarni kiriting (+ ,- , * , / , ) :");
        char amal = input.next().charAt(0);

        System.out.print(" 2 sonni kiritin :");
        double son2 = input.nextDouble();

        switch (amal) {
            case '+':
                System.out.println(son1 + son2);
                break;
            case '-':
                System.out.println(son1 - son2);
                break;
            case '*':
                System.out.println(son1 * son2);
                break;
            case '/':
                System.out.println(son1 / son2);
                break;
            default:
                System.out.println("bunde amal mavjud emas ");
        }
    }
}
