package gr11review.part1;

import java.io.*;

public class Review3 { 
    public static void main(String[] args) throws IOException {
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    for(int i = 0; i <= 100; i++){

      if(i % 2 != 0 && i >= 20){
        System.out.println(i);
      }
    }
    System.out.println(" ");
    for(int i2 = 29; i2 >= 2; i2--){
      System.out.println(i2);
    }
  }
}