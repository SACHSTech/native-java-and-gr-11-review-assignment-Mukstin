package gr11review.part1;

import java.io.*;
//print all the odd numbers between 20-100
//print numbers 29-2 in decreasing order
//Justin Ho Shue
public class Review3 { 
    
    public static void main(String[] args) throws IOException {
    
      BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
   
      //allows it to print off all the odd numbers between 20-100
      for (int i = 21; i <= 100; i+=2) {

        //if(i % 2 != 0 && i >= 20){
         System.out.println(i);
      }
  
      //allows it to print numbers 29 - 2 in decreasing order
      System.out.println("");
      for (int i2 = 29; i2 >= 2; i2--) {
  
      //for(int i2 = 29; i2 >= 2; i2--){
      System.out.println(i2);
    }
  }
}