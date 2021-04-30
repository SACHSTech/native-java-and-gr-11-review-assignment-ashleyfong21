package gr11review.part1;

import java.io.*;

/**
* A program that asks the user for a yearly amount, annual compound interest rate, and target amount, and outputs the number of years it will take to surpass that amount. For compound interest, the interest rate is applied to the existing amount after each year.                                                                    
* @author: Ashley Fong
* 
*/

public class Review7 { 
  public static void main(String[] args) throws IOException{
		BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    String theSentence; 
    String oddChar;
    int i; 
    int numChar; 
    int numSpaces;
    int letterA;
   
    System.out.println("Enter a sentence: ");
    theSentence = key.readLine();

    numChar = theSentence.length();
    System.out.println(numChar); 

    for (i = 1; i <= numChar; i++){
      
    }
    //System.out.println("")

  }
}