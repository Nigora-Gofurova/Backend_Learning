package Method;

import java.util.Scanner;

public class Task_03 {
    public int yuzlarXonasi(int son) {
        return son / 100;
    }
    public static void main(String[] args) {

        Task_03 myTask = new Task_03();

        Scanner sc = new Scanner(System.in);

        System.out.print("Uch xonali son kiriting: ");
        int son = sc.nextInt();

        System.out.println(myTask.yuzlarXonasi(son));
    }
}
