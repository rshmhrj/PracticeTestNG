package com.myapp;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MoneyTransferTest
{
	// amount
	// sender acc
	// sender name
	// rec acc
	// rec name
	
	@Test(dataProvider="getData")
	public void transferMoneyTest(String amount, String senderAcc, 
			String senderName, String recAcc, String recName)
	{
		System.out.println(amount + " -- "+senderAcc+" -- "+senderName+
				" -- "+recAcc+" -- "+recName);
		// selenium script
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[2][5];
		
		data[0][0] = "8202 USD";
		data[0][1] = "Sender 1 Account";
		data[0][2] = "Sender 1 Name";
		data[0][3] = "Receiver 1 Account";
		data[0][4] = "Receiver 1 Name";
		
		data[1][0] = "3123 USD";
		data[1][1] = "Sender 2 Account";
		data[1][2] = "Sender 2 Name";
		data[1][3] = "Receiver 2 Account";
		data[1][4] = "Receiver 2 Name";
		
		return data;
	}
}
