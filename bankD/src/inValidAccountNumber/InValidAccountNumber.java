package inValidAccountNumber;

public class InValidAccountNumber extends Exception {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public static final String MESSAGE="wrong account number please enter the right number";

public InValidAccountNumber() {
	super(MESSAGE);
	// TODO Auto-generated constructor stub
}



public InValidAccountNumber(String message) {
	super(message);
	// TODO Auto-generated constructor stub
}


}
