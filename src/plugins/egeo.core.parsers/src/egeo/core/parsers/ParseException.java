package egeo.core.parsers;

import java.io.IOException;

public class ParseException extends Exception {

	private static final long serialVersionUID = 1L;

	public ParseException(IOException e) {
		super(e);
	}

	public ParseException(String string) {
		super(string);
	}

}
