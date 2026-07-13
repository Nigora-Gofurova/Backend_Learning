package Method;

import java.util.Scanner;
public class Task_17 {
    public double soat(int sekund) {

        return sekund / 3600;
    }

    public static void main(String[] args) {

        Task_17 myObj = new Task_17();

        Scanner sc = new Scanner(System.in);

        System.out.print("Sekundni kiriting: ");
        int sekund = sc.nextInt();

        System.out.println(myObj.soat(sekund));
    }
}
