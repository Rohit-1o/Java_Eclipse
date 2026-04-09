package exception_handling1;

public class InsufficientBalanceException extends Exception {
	private float insufficientBalance;
	public InsufficientBalanceException(String errorMessage, float insufficientBalance) {
		super(errorMessage);
		this.insufficientBalance = insufficientBalance;
	}
	
	@Override
	public String getMessage() {
		String errMsg = super.getMessage();
		String finalMsg = errMsg + " -> " + insufficientBalance;
		return finalMsg;
	}
}
