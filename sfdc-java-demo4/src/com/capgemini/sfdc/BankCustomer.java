package com.capgemini.sfdc;

public class BankCustomer {
	
	static String ifsc;
	int acNo;
	String CustomerName;
	double balance;
	
	
	public static void main(String[] args)
	{
		BankCustomer.ifsc = "ABCD12345";
		System.out.println(BankCustomer.ifsc);
		BankCustomer obj = new BankCustomer();
		obj.acNo = 34554467;
		System.out.println(obj.acNo);
		
	}
}
