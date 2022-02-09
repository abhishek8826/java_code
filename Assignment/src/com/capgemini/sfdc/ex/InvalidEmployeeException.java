package com.capgemini.sfdc.ex;

public class InvalidEmployeeException extends RuntimeException {
		public InvalidEmployeeException() {
		super();
	}

		public InvalidEmployeeException(String message) {
		super(message);
	}
}
