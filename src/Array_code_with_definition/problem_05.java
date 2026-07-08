package Array_code_with_definition;

import java.util.Scanner;

public class problem_05 {
    public  static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("nechta element kiritasiz :");
        int N=input.nextInt();

        int[] arr=new int[N];

        for(int i=0;i<arr.length;i++){
            System.out.print( i+ " index dagi  son :");
            arr[i]=input.nextInt();
        }
        System.out.print("k1 index ni kiriting :");
        int k1=input.nextInt();
        System.out.print("k2 index ni kiriting :");
        int k2=input.nextInt();
        int kopaytma=1;
        for(int i=k1;i<=k2;i++){    // i=k1  boshlanish index   i <=k2   k2 index   shu index ham qowip  yuradi
            kopaytma=kopaytma*arr[i];         // har bir elementni  oldingi natijasiga kopaytiradi
        }
        System.out.println(kopaytma);
    }
}
