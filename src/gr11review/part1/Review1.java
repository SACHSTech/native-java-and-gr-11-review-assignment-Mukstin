package gr11review.part1;
import java.io.*;

//Enter a certain day and month 
//counts how many days are in the year with the information given 
//Assume no leap years
//Justin Ho Shue
  
  public class Review1 { 
      
      public static void main(String[] args) throws IOException {
      
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
    
    int intday = 0; 
    int intmonth = 0; 
    int intyearDays = 0;
  
  //Allows the question to print on screen 
  //Also allows people to type their answer
    
    System.out.println("Enter the month number: ");
    intmonth = Integer.parseInt(key.readLine());
   
    System.out.println("Enter the day number: ");
    intday = Integer.parseInt(key.readLine());
  
  if(intmonth < 2){
     intyearDays = intday;
     System.out.println(intyearDays);
    
    }else if(intmonth == 2){
       intyearDays = (intmonth-1)*31+intday;
       System.out.println(intyearDays);
   
    }else if(2 < intmonth && intmonth <5){
       intyearDays = (intmonth-2)*31+intday+28;
       System.out.println(intyearDays);
 
    }else if(4 < intmonth  && intmonth < 7){
       intyearDays = (intmonth - 2)*31+intday+28-1;
       System.out.println(intyearDays);

    }else if(6 < intmonth && intmonth < 10){
      intyearDays = (intmonth-2)*31+intday+28-2;
      System.out.println(intyearDays);

    }else if(9 < intmonth && intmonth < 12){
      intyearDays = (intmonth-2)*31+intday+28-3;
      System.out.println(intyearDays);

    }else{
      intyearDays = (intmonth-2)*31+intday+28-4;
      System.out.println(intyearDays);
       }
    }
}