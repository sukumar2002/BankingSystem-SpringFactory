package com.BankFactory.Imple.SpringCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.BankFactoryInterface.SpringCore.BankFactory;
import com.BankInterface.Implementations.SpringCore.HDFC;
import com.BankInterface.Implementations.SpringCore.SBI;
import com.BankInterface.SpringCore.Bank;
@Component
public class ConcreateBankFactory implements BankFactory{
	private final SBI sbi;
	private final HDFC hdfc;  
    @Autowired
	public ConcreateBankFactory(SBI sbi, HDFC hdfc) {
		super();
		this.sbi = sbi;
		this.hdfc = hdfc;
	}
	@Override
	public Bank createBank(String bankType) {
	 if(bankType.equalsIgnoreCase("sbi")) return sbi;
	 if (bankType.equalsIgnoreCase("HDFC")) return hdfc;
     throw new IllegalArgumentException("Invalid bank type");	  	
	}
}
