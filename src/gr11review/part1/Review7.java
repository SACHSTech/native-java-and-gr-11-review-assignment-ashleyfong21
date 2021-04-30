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

    //variables 
    String theSentence; 
    String oddChar;
    char character; 
    int i; 
    int numChar; 
    int numSpaces = 0;
    int letterA = 0;

    //user inputs sentence 
    System.out.println("Enter a sentence: ");
    theSentence = key.readLine();

    //finds the length/number of characters in the sentence
    numChar = theSentence.length();
    System.out.println(numChar); 

    //loops through the characters of the sentence
    for (i = 0; i < numChar; i++){
      character = theSentence.charAt(i);
      
      //finds number of spaces in the sentence 
      if(character == ' '){
        numSpaces++;
      }

      //finds number of letter a's in the sentence
      if(character == 'a'){
        letterA++;
      }
    }
    
    //prints number of a's and spaces 
    System.out.println(letterA);
    System.out.println(numSpaces);

    //takes every other character in the sentence to print a new one 
    for(i = 1; i < numChar; i = i + 2){
      character = theSentence.charAt(i);
      System.out.print(character);
    }

  }
}