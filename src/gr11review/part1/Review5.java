package gr11review.part1;

import java.io.*;

/**
* A program that asks the user for a yearly amount, annual compound interest rate, and target amount, and outputs the number of years it will take to surpass that amount. For compound interest, the interest rate is applied to the existing amount after each year.                                                                    
* @author: Ashley Fong
* 
*/

public class Review5 { 
  public static void main(String[] args) throws IOException{
		BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    //variables
    double yearlyAmount; 
    double compInterestRate; 
    double compAmount;
    double targetAmount; 
    double totalAmount = 0;
    int numYears = 0; 
    
    //ask user for input of invested amount, interest rate, and target amount
    System.out.print("Enter the yearly invested amount: ");
    yearlyAmount = Double.parseDouble(key.readLine());

    System.out.print("Enter the compound interest rate: ");
    compInterestRate = Double.parseDouble(key.readLine());

    System.out.print("Enter the target amount: ");
    targetAmount = Double.parseDouble(key.readLine());

    //loops until the total amount is passes the target amount
    while (targetAmount > totalAmount) {
      compAmount = totalAmount + yearlyAmount; 
      totalAmount = (compInterestRate/100 * compAmount);
      totalAmount = compAmount + totalAmount;
      numYears++;
    }
    
    //prints the number of years it takes to earn the target amount 
    System.out.println("The target amount will be earned in "+numYears+" years.");

  }
}