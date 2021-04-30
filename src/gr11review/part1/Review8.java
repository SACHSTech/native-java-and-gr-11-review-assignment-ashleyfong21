package gr11review.part1;

import java.io.*;

/**
*                                                                    
* @author: Ashley Fong
* 
*/

//for 1000 loop 

//for 3 loop 

//if all the #s are equal, triples++ 

public class Review8 { 
  public static void main(String[] args) throws IOException{
		BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    int i; 
    int c; 
    int numTriples = 0; 
    int random;
    
    int slotMach[][];
    slotMach = new int[1000][3];

    for (i = 0; i < 1000; i++){
      for(c = 0; c < 3; c++){
        //System.out.println(i);
        random = (int)(Math.random()*9);
        slotMach[i][c] = random;
        System.out.print(slotMach[i][c]+" ");
      }

      System.out.println("");

      if(slotMach[i][0] == slotMach[i][1] && slotMach[i][1] == slotMach[i][2]){
        numTriples++;
      }
    }

    System.out.println(numTriples);

  }
}