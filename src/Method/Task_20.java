package Method;

import java.util.Scanner;

public class Task_20 {
    public int belgiSoni(int kb) {

        return kb * 1024 / 2;
    }

    public static void main(String[] args) {

        Task_20 myObj = new Task_20();

        Scanner sc = new Scanner(System.in);

        System.out.print("KB = ");
        int kb = sc.nextInt();

        System.out.println(myObj.belgiSoni(kb));
    }
}
