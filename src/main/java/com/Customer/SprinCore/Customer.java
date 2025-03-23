package com.Customer.SprinCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.BankFactoryInterface.SpringCore.BankFactory;
import com.BankInterface.SpringCore.Bank;
@Component
public class Customer {
	private String customerName;
	private int customerId;
	private Bank bank;
	private BankFactory bankFactory;
	public Customer(String customerName, int customerId, Bank bank) {
		super();
		this.customerName = customerName;
		this.customerId = customerId;
		this.bank = bank;
	}
	@Autowired
	public Customer(BankFactory bankFactory) {
		super();
		this.bankFactory = bankFactory;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public void setBank(String bankType){
		 this.bank = bankFactory.createBank(bankType);
	}
	public void deposit(double amount) {
	      System.out.println(bank.deposit(amount));
	}
	public void withdraw(double amount) {
		System.out.println(bank.withdraw(amount));
	}
	 public void displayDetails() {
	        System.out.println("Customer ID: " + customerId);
	        System.out.println("Customer Name: " + customerName);
	        System.out.println(bank.toString());
	    }
}
