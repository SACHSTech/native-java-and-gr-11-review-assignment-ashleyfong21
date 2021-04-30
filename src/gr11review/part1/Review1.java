package gr11review.part1;

import java.io.*;

/** 
* A program that calculates the day of the year given the month number and day of the month
* @author: Ashley Fong
* 
*/

public class Review1 { 
  public static void main(String[] args) throws IOException{
		BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    //variables
    int monthNum;
    int dayNum;
    int dayYear;

    //user inputs of month and day numbers 
    System.out.print("Enter the month number: ");
		monthNum = Integer.parseInt(key.readLine());

    System.out.print("Enter the day number: ");
    dayNum = Integer.parseInt(key.readLine());

    //prints the day of the year based on the month that is picked
    if (monthNum == 1) {
      dayYear = 0 + dayNum; 
      System.out.println(dayYear); 
    }

    else if (monthNum == 2) {
      dayYear = 31 + dayNum;
      System.out.println(dayYear);
    }

    else if (monthNum == 3) {
      dayYear = 31 + 28 + dayNum;
      System.out.println(dayYear);
    }

    else if (monthNum == 4) {
      dayYear = 31 + 28 + 31 + dayNum;
      System.out.println(dayYear);
    }

    else if (monthNum == 5) {
      dayYear = 31 + 28 + 31 + 30 + dayNum;
      System.out.println(dayYear);
    }

    else if (monthNum == 6) {
      dayYear = 31 + 28 + 31 + 30 + 31 + dayNum;
      System.out.println(dayYear);
    }

    else if (monthNum == 7) {
      dayYear = 31 + 28 + 31 + 30 + 31 + 30 + dayNum;
      System.out.println(dayYear);
    }

    else if (monthNum == 8) {
      dayYear = 31 + 28 + 31 + 30 + 31 + 30 + 31 + dayNum;
      System.out.println(dayYear);
    }

    else if (monthNum == 9) {
      dayYear = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 30 + dayNum;
      System.out.println(dayYear);
    }

    else if (monthNum == 10) {
      dayYear = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 30 + 31 + dayNum;
      System.out.println(dayYear);
    }

    else if (monthNum == 11) {
      dayYear = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 30 + 31 + 30 + dayNum;
      System.out.println(dayYear);
    }

    else if (monthNum == 12) {
      dayYear = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 30 + 31 + 30 + 31 + dayNum;
      System.out.println(dayYear);
    }
    
  }
} 