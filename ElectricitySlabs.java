package Basics;

import java.util.Scanner;

public class ElectricitySlabs {
    public static void main(String[] args) {
        System.out.println("Enter the electricity bill");
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        int bill=0;
        if(units<=100){
            bill=units*5;
        }
        else if(units>100 && units<=200){
            int remains=units-100;
            bill=100*5;
            remains=remains*7;
            bill=bill+remains;
        }
        else if(units>=200){
            int remains1=100;
            bill=100*5;
            remains1=remains1*7;
            int remains2=units-200;

            remains2=remains2*10;
            bill=bill+remains1+remains2;

        }
        System.out.println("The electricity bill is "+bill);


    }
}
