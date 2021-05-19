package gr11review.part1;
import java.io.*;


public class Review7 { 
    
    public static void main(String[] args) throws IOException {
    
      BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
      
      String strtheSentence = "";
      String strdash = "";
      int intchars = 0;
      int intspaces = 0;
      int intlettera = 0;
      int counter = 0;

      System.out.println("write a sentence");
      strtheSentence = (key.readLine());
      intchars = strtheSentence.length();
      for (counter = 0; counter < strtheSentence.length();counter++) {
        if (strtheSentence.substring(counter,counter+1).equals(" ")) {
          intspaces++;
        } 
        
        if (strtheSentence.substring(counter,counter+1).equalsIgnoreCase("a")){
          intlettera++;
        } 
        if(counter%2==0){
          strdash+='-';
        }
        
      } 

      System.out.println("There are "+intchars+" characters in the sentence.");
      System.out.println("There are "+intspaces+" spaces in the sentence.");
      System.out.println("There are "+intlettera+" letter a in the sentence.");
      System.out.println(strdash);
    }
}