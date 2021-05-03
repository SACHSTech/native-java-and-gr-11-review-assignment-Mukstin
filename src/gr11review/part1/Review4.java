package gr11review.part1;

import java.io.*;
import java.text.*;
//Ask the user how many items you would like to buy
//ask the user for the price of each item
//calculate the Subtotal, tax, and total
//Justin Ho Shue
public class Review4 { 
    public static void main(String[] args) throws IOException {
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
      //to allow the numbers to print off as an actually amount of money (0.00 instead of 0.000000)
        DecimalFormat dollarFormat = new DecimalFormat("$###0.00");
    int intitemamount;
    double dblprice;
    double dbltotal;
    double dblsubtotal = 0;
    double dbltax;
      //prints a question and allows you to answer
    System.out.print("How many items do you want to buy? ");
    intitemamount = Integer.parseInt(key.readLine());
      // determines how many items you are buying
    for(int i = 0; i < intitemamount; i++) {
      {
        //allows you to enter the price for each item
      System.out.print("Enter the price of item number " + (i+1) + ": ");
      dblprice = Double.parseDouble(key.readLine());
         //calculates the subtotal
          dblsubtotal = dblsubtotal + dblprice;
         }
       }
        //calculates the tax and the total
        dbltax = dblsubtotal*0.13;
        dbltotal = dblsubtotal + dbltax;
        //prints off the subtotal, tax, and total 
        System.out.println("Subtotal: " +dollarFormat.format(dblsubtotal));
        System.out.println("Tax: " +dollarFormat.format(dbltax));
        System.out.println("Total: " +dollarFormat.format(dbltotal));
    }
}