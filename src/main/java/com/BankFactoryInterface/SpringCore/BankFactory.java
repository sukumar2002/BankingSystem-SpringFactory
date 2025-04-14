package com.BankFactoryInterface.SpringCore;

import com.BankInterface.SpringCore.Bank;

public interface BankFactory {
	Bank createBank(String bankType);
}
