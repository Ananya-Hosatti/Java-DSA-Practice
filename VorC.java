package Basics;

import java.util.Scanner;

public class VorC {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            switch(ch){
                case 'a','e','i','o','u':
                    System.out.println(ch+" "+"is an vowel");
                    break;
                default:
                    System.out.println(ch+" "+"is a consonant");

            }
        }


    }
}
