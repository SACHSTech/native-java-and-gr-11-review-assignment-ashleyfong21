package gr11review.part1;

import java.io.*;

/**
* A program that prints every odd number between 20 and 100, then prints 29 to 2 in decending order                                                                                     
* @author: Ashley Fong
* 
*/

public class Review5 { 
  public static void main(String[] args) throws IOException{
		BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    double yearlyAmount; 
    double compInterestRate; 
    double compAmount;
    double targetAmount; 
    double totalAmount = 0;
    int numYears = 0; 

    System.out.print("Enter the yearly invested amount: ");
    yearlyAmount = Double.parseDouble(key.readLine());

    System.out.print("Enter the compound interest rate: ");
    compInterestRate = Double.parseDouble(key.readLine());

    System.out.print("Enter the target amount: ");
    targetAmount = Double.parseDouble(key.readLine());

    while(targetAmount > totalAmount){
      compAmount = totalAmount + yearlyAmount; 
      totalAmount = (compInterestRate/100 * compAmount);
      totalAmount = compAmount + totalAmount;
      numYears++;
    }
    
    System.out.println("The target amount will be earned in "+numYears+" years.");

  }
}