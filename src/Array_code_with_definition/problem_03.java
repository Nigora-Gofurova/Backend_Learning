package Array_code_with_definition;

import java.util.Scanner;

public class problem_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" nechta son kiritasiz :");
        int n=input.nextInt();

        int[] arr=new int[n];

        for(int i=0;i<arr.length;i++){  // loop aylanadi berilgan songacha  i++ 1 qowberadi
            System.out.print( i + " son :");  // bu yerda i (index)   va  massivni uznligi sanab  ikkichi shartimiz uchun tayyorlayapmizda
            arr[i]=input.nextInt();
        }
        int juft=0;  // juf  va toqqa tekshirish uchun alohida  int ochip olyapmiz
        int toq=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){     //  if va else da juft  va toqqa  shart beryapmiz
                juft++;
            }else{
                toq++;
            }
        }
        System.out.println("juft :"+juft);
        System.out.println("toq :"+toq);
    }
}
