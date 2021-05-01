package gr11review.part1;

import java.io.*;
import java.text.DecimalFormat;

/**
* A cashier program where the user is able to keep entering item prices until the user enters 0. 
* @author: Ashley Fong
* 
*/

public class Review6 {
  public static void main(String[] args) throws IOException{
    DecimalFormat decimalFormat = new DecimalFormat("0.00");
		BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    //variables
    int i = 0; 
    double itemPrice = 1; 
    double subtotal = 0;
    double tax;
    double total; 

    //loops while the input is not 0
    //add the prive of the item to the subtotal 
    while (itemPrice != 0) {
        i++;
        System.out.print("Enter the price for an item: ");
        itemPrice = Double.parseDouble(key.readLine());
        subtotal = subtotal + itemPrice;
    }

    //calculates the tax and total
    tax = subtotal * 0.13;
    total = subtotal + tax; 

    //prints the subtotal, tax, and total in decimal format
    System.out.println("Subtotal: $"+ decimalFormat.format(subtotal));
    System.out.println("Tax: $"+ decimalFormat.format(tax));
    System.out.println("Total: $"+ decimalFormat.format(total));

  }
}