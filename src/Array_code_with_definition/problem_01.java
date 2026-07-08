package Array_code_with_definition;

import java.util.Scanner;

public class problem_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" nechta son kiritasiz :");
        int n = input.nextInt();  // arreyni uzunligi kiritp olamiz bu yerda

        int[] arr=new int[n];

        for(int i=0;i<arr.length;i++) {
            System.out.print(i+ " yana son kiriting :");   // bu yerda for loop ni ichidagi kod int berip idegan ozgaruvchi ochilyapti shunda i index boladi va uni 0 tenglap olyapti chunki  index 0 dan boshlanadi  shindan song i (index ) uzunligicha deb olyapmiz i++  esa bizga doim bir hil son chiqarbermaslik uchun  1 qoship ketadi shunda.
            arr[i] = input.nextInt();}  // bu uyerda  i (index)  qolda kiritadigan qilip olyapmiz

            for(int i=0;i<arr.length;i++) {    // ikkinchi for loop va if esa bizga  (for loop aylanyaptida natijani  aynan (if) juftga tekshirganimiz va 2 qoshishimiz  kerakligi uchun hizmat qilyapti
                if(arr[i]%2==0){   //juft
                    arr[i]+=2;   // chiqqan juft sonni 2 ga qowip ketadi
                }
            }
        System.out.println("new massive :");
            for(int i=0;i<arr.length;i++){  // bu yerdagi 3 for loop esa   natijani togri chiqarish uchun qoyilgan bu siz ham chiqarsa boladi lekin shart masala boyicha  aytilgani de chiqmedi agar sout ochip (arr) chiqara olmayman chunki arr bu massivni joyi yani manzili.
                System.out.println(arr[i]+" ");
            }
    }
}
