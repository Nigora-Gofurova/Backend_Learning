package My_Math_Lib;

import java.util.Scanner;

//1
public class MyMathLib {
    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    //2
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    //3
    public static int lsm(int a, int b) {
        if (a == 0 || b == 0) return 0;
        return Math.abs(a / gcd(a, b) * b);
    }

    //4
    public static int reverseNumber(int N) {
        int reversed = 0;

        while (N > 0) {
            int digit = N % 10;
            reversed = (reversed * 10) + digit;
            N /= 10;
        }
        return reversed;
    }



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
//1
            int n = sc.nextInt();
            System.out.print("factarial" +factorial(sc.nextInt()));
//2
            int c = sc.nextInt();
            int d= sc.nextInt();
            int EKUB=gcd(c,d);
            System.out.println("GCD "+EKUB);
//3
            int a=sc.nextInt();
            int b=sc.nextInt();
            int javob=Math.abs(a/gcd(a,b)*b);
            System.out.println("Ekuk "+javob);
//4
            System.out.println("Enter a number: ");
            int N= sc.nextInt();
            int natija=reverseNumber(N);
            System.out.println("reverse Number "+natija);


        }
    }

