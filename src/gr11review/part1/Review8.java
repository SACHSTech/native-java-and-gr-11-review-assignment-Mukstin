package gr11review.part1;
import java.io.*;

public class Review8 { 
    
    public static void main(String[] args) throws IOException {
     
      BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
      
      int intrandom1;
      int intrandom2;
      int intrandom3;
      int intnumberofwins = 0;
      int counter;
    
      for (counter = 0; counter < 1000; counter++) {
        intrandom1 = (int)(Math.random()*9);
        intrandom2 = (int)(Math.random()*9);
        intrandom3 = (int)(Math.random()*9);
        System.out.println(intrandom1+" "+intrandom2+" "+intrandom3);
      
        if (intrandom1==intrandom2 && intrandom2 == intrandom3) {
          intnumberofwins++;
        }
      }
      System.out.println(intnumberofwins);
    }
}