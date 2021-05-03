package gr11review.part1;


import java.io.*;
//ask for a yearly amount and an annual compound intrest rate
//calculates the number of years 
//For compound intrerest, the interest rate is applied to the existing amount after each year
//Justin Ho Shue
public class Review5 { 
    public static void main(String[] args) throws IOException {
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

int intnumberofyears =0;
double dblYIA; //YIA stands for yearly invested amount
double dblCIR; //CIR stands for Compound Interest Rate 
double dbltargetamount;
double dblamountinvested = 0;
double dbladdingstuff = 0;
//Prints the questions and allows you to answer
System.out.print("Enter the yearly invested amount: ");
dblYIA = Double.parseDouble(key.readLine());
System.out.print("Enter the compound interest rate: ");
dblCIR = Double.parseDouble(key.readLine());
System.out.print("Enter the target amount: ");
dbltargetamount = Double.parseDouble(key.readLine());
dblamountinvested = dblYIA;
//continously does those 2 equations within the loop until it is more than the target amount
while(dblamountinvested < dbltargetamount) {
    intnumberofyears++;
    //calculates the amount of money made after a year
    dbladdingstuff = (dblCIR/dblYIA)*dblamountinvested;
    dblamountinvested += (dblYIA + dbladdingstuff);
  
}
  //prints off the number of years
System.out.println("The target amount will be earned in " +intnumberofyears+ " years.");
    }
}