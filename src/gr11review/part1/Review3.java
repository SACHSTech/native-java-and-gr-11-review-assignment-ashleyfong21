package gr11review.part1;

import java.io.*;

/**
* A program that prints every odd number between 20 and 100, then prints 29 to 2 in decending order                                                                                     
* @author: Ashley Fong
* 
*/

public class Review3 { 
  public static void main(String[] args) throws IOException{
		BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
    
    int i; 
    
    for(i = 21; i <= 100; i = i + 2){
      System.out.println(i);

    }

    System.out.println("");

    for(i = 29; i >= 2; i--){
      System.out.println(i);

    }

  }
}