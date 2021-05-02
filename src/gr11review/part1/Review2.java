package gr11review.part1;

import java.io.*;

public class Review2 { 
    public static void main(String[] args) throws IOException {
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    int intselection;
    intselection = 0;

      System.out.println("0 - print a joke about your hair");
      System.out.println("1 - print a joke about your feet"); 
      System.out.println("2 - print a joke about your clothes");
      System.out.println("3 - print a joke about your teacher");
      
      System.out.println("Choose a menu option: ");
      intselection = Integer.parseInt(key.readLine());
    
      if (intselection == 0) {
          System.out.println("Why do bees have sticky hair?");
          System.out.println("They always use honeycombs.");
      }else if (intselection == 1){
          System.out.println("How does a froggy feel with a broken foot");
          System.out.println("Unhoppy");
      }else if (intselection == 2){
          System.out.println("What d you call a person who wears cowboy clothes?");
          System.out.println("Ranch dressin'");
      }else if (intselection == 3){
          System.out.println("Why were the teachers eyes crossed?");
          System.out.println("She couldn't control her pupils");
      }else if (intselection > 3){
          System.out.println("Invalid menu option");
        }
      }
    }

