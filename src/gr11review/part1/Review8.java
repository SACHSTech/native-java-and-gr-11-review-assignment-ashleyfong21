package gr11review.part1;

import java.io.*;

/**
* A program that simulates 1000 pulls of a slot machine, such that 3 random numbers (between 0 and 8) are generated for each pull. Outputs the total number times a triple (all 3 numbers equal) was pulled
* @author: Ashley Fong
* 
*/

public class Review8 { 
  public static void main(String[] args) throws IOException{
		BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    //variables 
    int i; 
    int c; 
    int numTriples = 0; 
    int random;
    
    //set up array
    int slotMach[][];
    slotMach = new int[1000][3];

    //randomizing slot numbers and loading them in the array 
    for (i = 0; i < 1000; i++) {
      for (c = 0; c < 3; c++) {
        random = (int)(Math.random()*9);
        slotMach[i][c] = random;
        System.out.print(slotMach[i][c]+" ");
      }

      System.out.println("");

      //checking if all the numbers in a pull are the same
      //if yes, the number of triples increases
      if (slotMach[i][0] == slotMach[i][1] && slotMach[i][1] == slotMach[i][2]) {
        numTriples++;
      }
    }

    System.out.println(numTriples);

  }
}