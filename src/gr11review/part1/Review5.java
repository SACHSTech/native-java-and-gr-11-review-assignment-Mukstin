package gr11review.part1;


import java.io.*;

public class Review5 { 
    public static void main(String[] args) throws IOException {
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

int intnumberofyears =0;
double dblYIA; //YIA stands for yearly invested amount
double dblCIR; //CIR stands for Compound Interest Rate 
double dbltargetamount;
double dblamountinvested = 0;
double dbladdingstuff;

System.out.print("Enter the yearly invested amount: ");
dblYIA = Double.parseDouble(key.readLine());
System.out.print("Enter the compound interest rate: ");
dblCIR = Double.parseDouble(key.readLine());
System.out.print("Enter the target amount: ");
dbltargetamount = Double.parseDouble(key.readLine());

while(dblamountinvested < dbltargetamount) {
    intnumberofyears++;
    dbladdingstuff = (dblCIR/dblYIA)*dblamountinvested;
    dblamountinvested += dblYIA + dbladdingstuff;
}
System.out.println("The target amount will be earned in " +intnumberofyears+ " years.");
    }
}