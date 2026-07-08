package Array_code_with_definition;

import java.util.Scanner;

public class problem_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("butun sonlardan nechta kiritasiz :");
        int n = input.nextInt();  // nechta son borligi  kiritamiz

        int[] arr = new int[n];  // n massivini yaratadi

        for(int i=0;i<arr.length;i++){  // bu for loop  barcha elementlarni  tekshirish uchun ishlatiladi.
            System.out.print(i+ " son :" ); //user qaysi sonni  kiritganni korsatadi
            arr[i] = input.nextInt();  // user kiritgan  sonni   massivini  i (index) ni saqledo
        }
        int count = 0; // sonni sanedi (boshlanishi)

        for(int i=0;i<arr.length;i++){  // yana qayta sanedi massivni
            if(arr[i]>25 && arr[i]%2!=0){   //massivni  manfiy yoki  toq ekanligini  tekshiradi
                count++; // natijani 1 ga oshiradi
            }
        }
        System.out.println("25 dan katta toq sonlar soni :"+count); //output
    }
}
