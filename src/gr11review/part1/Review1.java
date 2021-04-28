package gr11review.part1;

import java.io.*;

public class Review1 { 
  public static void main(String[] args) throws IOException{
		BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    int monthNum;
    int dayNum;
    int dayYear;

    System.out.print("Enter the month number: ");
		monthNum = Integer.parseInt(key.readLine());

    System.out.print("Enter the day number: ");
    dayNum = Integer.parseInt(key.readLine());

    if(monthNum == 1){
      dayYear = 0 + dayNum; 
      System.out.println(dayYear); 
    }

    if(monthNum == 2){
      dayYear = 31 + dayNum;
      System.out.println(dayYear);
    }

    if(monthNum == 3){
      dayYear = 31 + 28 + dayNum;
      System.out.println(dayYear);
    }

    if(monthNum == 4){
      dayYear = 31 + 28 + 31 + dayNum;
      System.out.println(dayYear);
    }

    if(monthNum == 5){
      dayYear = 31 + 28 + 31 + 30 + dayNum;
      System.out.println(dayYear);
    }

    if(monthNum == 6){
      dayYear = 31 + 28 + 31 + 30 + 31 + dayNum;
      System.out.println(dayYear);
    }

    if(monthNum == 7){
      dayYear = 31 + 28 + 31 + 30 + 31 + 30 + dayNum;
      System.out.println(dayYear);
    }

    if(monthNum == 8){
      dayYear = 31 + 28 + 31 + 30 + 31 + 30 + 31 + dayNum;
      System.out.println(dayYear);
    }

    if(monthNum == 9){
      dayYear = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 30 + dayNum;
      System.out.println(dayYear);
    }

    if(monthNum == 10){
      dayYear = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 30 + 31 + dayNum;
      System.out.println(dayYear);
    }

    if(monthNum == 11){
      dayYear = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 30 + 31 + 30 + dayNum;
      System.out.println(dayYear);
    }

    if(monthNum == 12){
      dayYear = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 30 + 31 + 30 + 31 + dayNum;
      System.out.println(dayYear);
    }
    
  }
} 