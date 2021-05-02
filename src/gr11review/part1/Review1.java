package gr11review.part1;
import java.io.*;

public class Review1 { 
    public static void main(String[] args) throws IOException {
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
    
    int intday = 0; 
    int intmonth = 0; 
    int intyear = 0;
  
    System.out.println("Enter the month number: ");
    intmonth = Integer.parseInt(key.readLine());
    
    System.out.println("Enter the day number: ");
    intday = Integer.parseInt(key.readLine());

      intyear = intday + (intmonth - 1)*30 ;  

    System.out.println(+intyear);

  }
}