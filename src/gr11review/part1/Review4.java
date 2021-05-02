package gr11review.part1;

import java.io.*;
import java.text.*;

public class Review4 { 
    public static void main(String[] args) throws IOException {
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
      
        DecimalFormat dollarFormat = new DecimalFormat("$###0.00");
    int intitemamount;
    double dblprice;
    double dbltotal;
    double dblsubtotal = 0;
    double dbltax;
  
    System.out.print("How many items do you want to buy? ");
    intitemamount = Integer.parseInt(key.readLine());

    for(int i = 0; i < intitemamount; i++) {
      {
      System.out.print("Enter the price of item number " + (i+1) + ": ");
      dblprice = Double.parseDouble(key.readLine());
          dblsubtotal = dblsubtotal + dblprice;
         }
       }
        dbltax = dblsubtotal*0.13;
        dbltotal = dblsubtotal + dbltax;

        System.out.println("Subtotal: " +dollarFormat.format(dblsubtotal));
        System.out.println("Tax: " +dollarFormat.format(dbltax));
        System.out.println("Total: " +dollarFormat.format(dbltotal));
    }
}