package com.Main.BankConsoleApp;

import java.util.Scanner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.AppConfig.SpringCore.AppConfig;
import com.Customer.SprinCore.Customer;

public class BankApp {
	 public static void main(String[] args) {
	        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	        Customer customer = context.getBean(Customer.class);
	        
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter Customer ID: ");
	        int customerId = scanner.nextInt();
	        scanner.nextLine(); // Consume newline
	        
	        System.out.print("Enter Customer Name: ");
	        String customerName = scanner.nextLine();
	        
	        System.out.print("Enter Bank Name (SBI/HDFC): ");
	        String bankType = scanner.nextLine();
	        
	        customer.setCustomerId(customerId);
	        customer.setCustomerName(customerName);
	        customer.setBank(bankType);
	        
	        System.out.print("Enter deposit amount: ");
	        double depositAmount = scanner.nextDouble();
	        customer.deposit(depositAmount);
	        
	        System.out.print("Enter withdrawal amount: ");
	        double withdrawAmount = scanner.nextDouble();
	        customer.withdraw(withdrawAmount);
	        
	        customer.displayDetails();
	        scanner.close();
	 }
}
