package inSufficientFund;

public class InSufficientFundException extends Exception {
	
	private static final String MESSAGE = "INSUFFICIENT FUND try a lesser amount";

	public InSufficientFundException(String MESSAGE) {
		super(MESSAGE);
		// TODO Auto-generated constructor stub
	}
public InSufficientFundException() {
	super(MESSAGE);
}
	

}
