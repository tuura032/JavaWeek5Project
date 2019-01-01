package week5CodingAssignment;

public class AsteriskLogger implements Logger {

	@Override
	public void Log(String log) {
		System.out.println("***" + log + "***");
		
	}

	@Override
	public void Error(String error) {
		
		// make counter to increase asterisk length if needed
		int asteriskLength = 12;
		
		// add asterisks if there are many characters
		if (error.length() > 15) {
			asteriskLength += 3;
		} else if (error.length() > 10) {
			asteriskLength += 2;
		}
		
		// print content
		for (int i = 0; i < (error.length() + asteriskLength); i++) {
			System.out.print('*');
		}
		System.out.println("\n***Error: " + error + "***");
		for (int i = 0; i < (error.length() + asteriskLength); i++) {
			System.out.print('*');
		}
		System.out.print("\n");
	}



}
