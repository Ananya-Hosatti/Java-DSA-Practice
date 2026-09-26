package Basics;


import java.util.Scanner;

public class Profit_Loss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Buying price");
        double buy=sc.nextDouble();
        System.out.println("Enter the Selling price");
        double sell=sc.nextDouble();
        if(sell>buy){
            double profit=sell-buy;
            double profitPercent=(profit/buy)*100;
            System.out.println("Your profit is "+profit);
            System.out.println("Profit: "+profitPercent);
        }
        else if(sell<buy){
            double loss=buy-sell;
            double lossPercent=(loss/buy)*100;
            System.out.println("Your loss is "+loss);
            System.out.println("Loss: "+lossPercent);
        }
        else{
            System.out.println("No Profit No loss");
        }



    }
}
