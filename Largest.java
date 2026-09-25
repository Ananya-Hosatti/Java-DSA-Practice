package Basics;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers a b & c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("a is larger");
            }
            else{
                System.out.println("c is larger");
            }
        }
        else{
            if(b>c){
                System.out.println("b is larger");
            }
            else{
                System.out.println("c is larger");
            }
        }

    }
}
