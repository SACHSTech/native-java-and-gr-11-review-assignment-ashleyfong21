package gr11review.part1;

import java.io.*;
import java.text.DecimalFormat;

/**
* A program that asks the user how many items they would like to purchase. The user enters the prices of each item and the program prints the subtotal, tax,and total. 
* @author: Ashley Fong
* 
*/

public class Review4 {
   public static void main(String[] args) throws IOException{
    DecimalFormat decimalFormat = new DecimalFormat("0.00");
		BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    int numItems;
    int i;
    double itemPrice; 
    double subtotal = 0; 
    double tax;
    double total;

    System.out.print("How many items do you want to buy? ");
    numItems = Integer.parseInt(key.readLine());

    for(i = 1; i <= numItems; i++){
      System.out.print("Enter the price for item "+i+": ");
      itemPrice = Double.parseDouble(key.readLine());

      subtotal = subtotal + itemPrice; 

    }

    tax = subtotal * 0.13;
    total = subtotal + tax;

    System.out.println("Subtotal: $"+ decimalFormat.format(subtotal));
    System.out.println("Tax: $"+ decimalFormat.format(tax));
    System.out.println("Total: $"+ decimalFormat.format(total));

  }
}