package gr11review.part1;
import java.io.*;

//

public class Review1 { 
    public static void main(String[] args) throws IOException {
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
    
    int intday = 0; 
    int intmonth = 0; 
    int intyear = 0;
  //Allows the question to print on screen 
  //Also allows people to type their answer
    System.out.println("Enter the month number: ");
    intmonth = Integer.parseInt(key.readLine());
    
    System.out.println("Enter the day number: ");
    intday = Integer.parseInt(key.readLine());
  //Calculates the amount of days in a year
      intyear = intday + (intmonth - 1)*30 ;  

    System.out.println(+intyear);

  }
}