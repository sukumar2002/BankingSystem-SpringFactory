package com.BankInterface.Implementations.SpringCore;

import org.springframework.stereotype.Component;

import com.BankInterface.SpringCore.Bank;
@Component
public class SBI implements Bank{
	
	private double amount;
	 
	public SBI() {
	   this.amount=0.0;
	}
	 @Override
	    public synchronized double getAmount() {
	        return amount;
	    }
	    
	    @Override
	    public synchronized void setAmount(double amount) {
	        this.amount = amount;
	    }
	    
	    @Override
	    public synchronized String deposit(double amount) {
	        this.amount += amount;
	        return "Deposited " + amount + " to SBI account. Current Balance: " + this.amount;
	    }
	    
	    @Override
	    public synchronized String withdraw(double amount) {
	        if (this.amount >= amount) {
	            this.amount -= amount;
	            return "Withdrawn " + amount + " from SBI account. Current Balance: " + this.amount;
	        }
	        return "Insufficient balance in SBI account.";
	    }
	    
	 @Override
	    public String toString() {
	        return "SBI Account Balance: " + this.amount;
	    }
}
