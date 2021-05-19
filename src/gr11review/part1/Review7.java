package gr11review.part1;

import java.io.*;

/**
* A program counts the number of characters, spaces, and letter a's in a sentence.
* @author: Ashley Fong
* 
*/

public class Review7 { 
  public static void main(String[] args) throws IOException{
		BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    //variables 
    String theSentence; 
    char character; 
    int i; 
    int numChar; 
    int numSpaces = 0;
    int letterA = 0;

    //user inputs sentence 
    System.out.print("");
    theSentence = key.readLine();

    //finds the length/number of characters in the sentence
    numChar = theSentence.length();
    System.out.println("There are "+numChar+" characters in the sentence."); 

    //loops through the characters of the sentence
    for (i = 0; i < numChar; i++) {
      character = theSentence.charAt(i);
      
      //finds number of spaces in the sentence 
      if (character == ' ') {
        numSpaces++;
      }

      //finds number of letter a's in the sentence
      else if (character == 'a') {
        letterA++;
      }
    }
    
    //prints number of a's and spaces 
    System.out.println("There are "+numSpaces+" spaces in the sentence.");
    System.out.println("There are "+letterA+" letter a in the sentence.");

    //prints a dash in replacement for every other letter of the sentence
    for (i = 0; i < numChar; i = i + 2) {
      character = theSentence.charAt(i);
      System.out.print("-");
    }

  }
}