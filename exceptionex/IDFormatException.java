package exceptionex;

public class IDFormatException extends Exception { // 506p.  e.getlocalizedmessage,   super(message) <-> e.getMessage();
	public IDFormatException(String message) {
		super(message);
	}

}
