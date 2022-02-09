package com.capgemini.sfdc.oops;

interface SomeInterface {

}

interface StateGovt {

}

interface GovtOfIndia {

	void paySalaries();

}

abstract class Rbi {

	abstract void doKyc();

	void payInterest() {

	}
}

class HdfcBank extends Rbi implements GovtOfIndia, StateGovt {

	@Override
	void doKyc() {
		// specify the process - aadhaar, pan, voter
	}

	void giveLoans() {
		// code
		//System.out.println("hello");
	}

	void takeDeposits() {
		// code
	}

	@Override
	public void paySalaries() {
		// TODO Auto-generated method stub

	}

}



public class Abstract {
	public static void main(String[] args) {
		HdfcBank obj = new HdfcBank();
		Rbi obj1 = new Rbi();
		obj.giveLoans();
		obj.takeDeposits();
		obj.doKyc();
	}
}
