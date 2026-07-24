package Problem_Solving;

import java.util.Scanner;

public class Task_02 {

        public int countVowels(String text) {

            int count = 0;

            text = text.toLowerCase();

            for (int i = 0; i < text.length(); i++) {

                char harf = text.charAt(i);

                if (harf == 'a' || harf == 'e' || harf == 'i' || harf == 'o' || harf == 'u') {
                    count++;
                }

            }

            return count;

        }

        public static void main(String[] args) {

            Task_02 myObj = new Task_02();

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a word or sentence: ");
            String text = sc.nextLine();

            int result = myObj.countVowels(text);

            System.out.println("Number of vowels: " + result);

        }

    }
