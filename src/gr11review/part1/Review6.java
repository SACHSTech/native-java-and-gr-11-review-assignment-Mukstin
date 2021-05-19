package gr11review.part1;
import java.io.*;
import java.text.*;
//
public class Review6 { 
    
    public static void main(String[] args) throws IOException {
      
      BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
      
      DecimalFormat dollarFormat = new DecimalFormat("$###0.00");
    
      double dblprice = 1;
      double dbltotal;
      double dblsubtotal = 0;
      double dbltax;
      int intcounter = 1;

      //continously asks the same question until the answer is 0 
      while (dblprice != 0) {
    
        System.out.print("Enter the price of item number: ");
        dblprice = Double.parseDouble(key.readLine());
        
        dblsubtotal += dblprice;  
        intcounter++;
      }
      dbltax = dblsubtotal*0.13;
      dbltotal = dblsubtotal + dbltax;

      System.out.println("Subtotal: " +dollarFormat.format(dblsubtotal));
      System.out.println("Tax: " +dollarFormat.format(dbltax));
      System.out.println("Total: " +dollarFormat.format(dbltotal));
    }
}