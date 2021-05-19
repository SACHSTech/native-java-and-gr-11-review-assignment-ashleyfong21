package gr11review.part1;

import java.io.*;

/**
* A program that prints a joke based on the input of the user
* @author: Ashley Fong
* 
*/

public class Review2 { 
  public static void main(String[] args) throws IOException{
		BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    //variable
    int userOption; 

    //options for user to choose from 
    System.out.println("0 - print a joke about your hair");
    System.out.println("1 - print a joke about your feet");
    System.out.println("2 - print a joke about your clothes");
    System.out.println("3 - print a joke about your teacher");

    //user inputs their option
    System.out.print("Choose a menu option: ");
    userOption = Integer.parseInt(key.readLine());

    //prints a joke based on what the user inputs 
    if (userOption == 0) {
      System.out.println("Why do bees have sticky hair?");
      System.out.println("They always use honeycombs.");

    }

    else if (userOption == 1) {
      System.out.println("What do princes wear on their feet?");
      System.out.println("Heir Jordans.");

    }

    else if (userOption == 2) {
      System.out.println("What do you call Santa Claus with unfolded clothes?");
      System.out.println("Kris Wrinkle.");

    }
    
    else if (userOption == 3) {
      System.out.println("Why did the teacher write on the window?");
      System.out.println("Because she wanted the lesson to be very clear.");
      
    }

    //prints if an invalid number is inputted 
    else {
      System.out.println("Invalid menu option"); 
      
    }

  }
}