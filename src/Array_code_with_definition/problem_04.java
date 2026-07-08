package Array_code_with_definition;

import java.util.Scanner;

public class problem_04 {
    public  static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" nechta element kiritasiz :");
        int n=input.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.print(i+ " son :");  // loop sanaydi berilgaan massivgacha
            arr[i]=input.nextInt();
        }
        System.out.print(" k indeksini kiritng :");
        int k=input.nextInt();   // bu yerda  index uchun alohida int ochyapmiz

        int sum =arr[k-1]+arr[k+1];   //index sini yani chapdan k-1  boladi  ong tomonini k+1  qiymatni qowyapri   sum esa ozgaruvchini saqleydi
        System.out.println(sum);
    }
}
