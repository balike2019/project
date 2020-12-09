package wrongPinException;

public class WrongPinException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String MESSAGE ="YOU HAVE ENTER WRONG PIN PLEASE ENTER THE RIGHT";
public WrongPinException() {
	super(MESSAGE);
}

public WrongPinException(String message) {
	super(message);
	// TODO Auto-generated constructor stub
}


}
