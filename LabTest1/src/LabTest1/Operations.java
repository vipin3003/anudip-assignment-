package LabTest1;

import java.util.Scanner;

public class Operations {
	  public static void main(String[] args) {

	    char choice;

	    // create an object of Scanner class
	    Scanner input = new Scanner(System.in);

	    
	    

	    // ask users to enter numbers
	    System.out.print("Enter first number: ");
	    int num1 = input.nextInt();

	    System.out.print("Enter second number: ");
	    int num2 = input.nextInt();
	    
	    
	    
	    System.out.println("Choose an operator: +, -, *,/, or %");
	    choice = input.next().charAt(0);

	    switch (choice) {

	      
	      case '+':
	        System.out.println("Addition :"+(num1+num2));
	        break;

	      
	      case '-':
	        System.out.println("Substraction :"+(num1-num2));
	        break;

	      
	      case '*':  
	        System.out.println("Multiplication :"+(num1*num2));
	        break;

	      
	      case '/': 
	        System.out.println("Division :"+(num1/num2));
	        break;
	        
	     
	      case '%':
	        System.out.println("Modulus :"+(num1%num2));
	        break;


	      default:
	        System.out.println("Invalid option!");
	        break;
	    }

	   
	  }
	}