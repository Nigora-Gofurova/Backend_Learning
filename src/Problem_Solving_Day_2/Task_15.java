package Problem_Solving_Day_2;

import java.util.Scanner;

public class Task_15 {
    public void character(int kb) {

        int bayt = kb * 1024;

        int result = bayt / 2;

        System.out.println(result);

    }

    public static void main(String[] args) {

        Task_15 myObj = new Task_15();

      Scanner sc = new Scanner(System.in);

        System.out.print("KB kiriting: ");
        int kb = sc.nextInt();

        myObj.character(kb);

    }
}