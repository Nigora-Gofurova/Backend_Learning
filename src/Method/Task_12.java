package Method;

import  java.util.Scanner;

public class Task_12 {
    public int minglik(int son) {

        return (son / 1000) % 10;
    }

    public static void main(String[] args) {

        Task_12 myTask = new Task_12();

        Scanner sc = new Scanner(System.in);

        System.out.print("Son kiriting: ");
        int son = sc.nextInt();

        System.out.println(myTask.minglik(son));
    }
}
