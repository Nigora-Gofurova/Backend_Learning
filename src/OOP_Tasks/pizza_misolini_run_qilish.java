package OOP_Tasks;

import java.util.Scanner;
import java.util.Arrays;

public class pizza_misolini_run_qilish {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("pizza olchamini kiriting (S, M, L ) :");
        String size = input.nextLine();

        System.out.print("pizza topings larini kiriting (pishloq,mol goshti,tovuq goshti,pamidor,qoziqorin,kalbasa :");
        String [] toppings = input.nextLine().split(" ");

        System.out.print("sabzavotlikmi :");
        boolean sabzavotlikmi = Boolean.parseBoolean(input.nextLine());

        System.out.print("sous qosheymi :");
        boolean sous= Boolean.parseBoolean(input.nextLine());

        System.out.print("Xamir turi (yupqa , qalin ) :" );
        String xamir = input.nextLine();

        Pizza pizza= new Pizza( size,toppings,sabzavotlikmi,sous,xamir);

        System.out.println("\n ");
        System.out.println(size);
        System.out.println(Arrays.toString(toppings));
        System.out.println(sabzavotlikmi);
        System.out.println(sous);
        System.out.println(xamir);
        System.out.println("umumiy narx " + pizza.getPrice());

    }
}
