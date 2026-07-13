package Method;

import java.util.Scanner;

public class Task_11 {
    public int yuzlik(int son) {

        return (son / 100) % 10;
    }

    public static void main(String[] args) {

        Task_11 myObj = new Task_11();

        Scanner sc = new Scanner(System.in);

        System.out.print("Son kiriting: ");
        int son = sc.nextInt();

        System.out.println(myObj.yuzlik(son));
    }
}
