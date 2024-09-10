package com.sunbeam;

public class InvalidTimeException extends Throwable {
	private String invalidField;
	private int invalidInput;
	
	public InvalidTimeException(String invalidField, int invalidInput) {
		super();
		this.invalidField = invalidField;
		this.invalidInput = invalidInput;
	}

	public String getInvalidField() {
		return invalidField;
	}

	public void setInvalidField(String invalidField) {
		this.invalidField = invalidField;
	}

	public int getInvalidInput() {
		return invalidInput;
	}

	public void setInvalidInput(int invalidInput) {
		this.invalidInput = invalidInput;
	}

	@Override
	public String toString() {
		return "InvalidTimeException [invalidField=" + invalidField + ", invalidInput=" + invalidInput + "]";
	}
 @Override
public String getMessage() {
	
	return String.format("Invalid %s is %d",invalidField,invalidInput );
}
	
	
	

}
