package Problem_Solving;

import java.util.Scanner;

public class Task_14 {
    public void initials(String fullname) {

        int space = fullname.indexOf(' ');

        char first = fullname.charAt(0);

        char second = fullname.charAt(space + 1);

        System.out.println(first + "." + second);

    }

    public static void main(String[] args) {

        Task_14 myObj = new Task_14();

        Scanner sc = new Scanner(System.in);

        System.out.print("Ism va familiyani kiriting: ");
        String fullname = sc.nextLine();

        myObj.initials(fullname);

    }

}
