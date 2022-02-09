package com.capgemini.sfdc.ex;

public class MyException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int i = 1;
	int j = 2;

	public MyException(String string) {
		// TODO Auto-generated constructor stub
	}
	void MyExceptin( ){
		int i = int j;
	}
	public String toString() {
			return ("MyException occurred:"+i );
	}

}
class Example1{
	public static void main(String[] args) {
		try {
			throw new MyException("This is my error message");
		}
		catch(MyException exp) {
			System.out.println(exp);
		}
	}

	public void productCheck(int i) {
		// TODO Auto-generated method stub
		
	}
}