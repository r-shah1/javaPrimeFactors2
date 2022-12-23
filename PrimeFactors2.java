//PrimeFactors2.java
//Program that finds if a user input is a prime number. 
///and/or calculates it's unique prime factors
//By Ruhul Shah

import java.util.Scanner;
import java.util.Set;
import java.util.List;
import java.util.HashSet;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;  

public class PrimeFactors2 {
   public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a whole number:");

      //check input for whole number then run primeFactorCalc
      try {
    	  int userInput = input.nextInt();
    	  primeFactorCalc(userInput);
      }
      catch (Exception err) {
    	  System.out.println("ERROR: Please restart the program and enter whole numbers only");
      }
   }// end main
   
   //method to determine if user input is prime and print, if not print it's unique prime factors
   public static void primeFactorCalc (int userInput) {
	  List<Integer> listPrimeFactors = new ArrayList<>(); //holds prime factors of userInput
	  for(int i = 2; i < userInput; i++) {
          while(userInput % i == 0) {
        	 listPrimeFactors.add(i);
             System.out.println("Prime Factors: " + i);
	         userInput /= i;
	      }
	  }
      if(userInput >2) {
    	 System.out.println("Prime Factors: " + userInput);
    	 listPrimeFactors.add(userInput);
      }
      //change List to HashSet to remove duplicate prime factors then print
      Set<Integer> setPrimeFactors = new HashSet<>(listPrimeFactors);
      System.out.println("Unique Prime Factors: " + setPrimeFactors);
   }//end method primeFactorCalc
}
