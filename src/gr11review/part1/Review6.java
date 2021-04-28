package gr11review.part1;

import java.io.*;
import java.text.DecimalFormat;

/**
* A cashier program where the user is able to keep entering item prices until the user enters 0. 
* @author: Ashley Fong
* 
*/

public class Review6 {
  public static DecimalFormat decimalFormat = new DecimalFormat("0.00");

  public static void main(String[] args) throws IOException{
		BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    int i = 0; 
    double itemPrice = 1; 
    double subtotal = 0;
    double tax;
    double total; 

    while(itemPrice != 0){
        i++;
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