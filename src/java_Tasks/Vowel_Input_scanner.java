package java_Tasks;

import java.util.Scanner;

public class Vowel_Input_scanner {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter desired inut: ");
            char che=sc.next().charAt(0);
            // char che=sc.next().toLowercase().charAt(0);

            if(che =='a' ||che =='e' ||che =='u' ||che == 'i' ||che == 'o')
            {
                System.out.println("Given input is vowel:");
            }
            else
            {
                System.out.println("Given input is not vowel:");
            }


        }
    }