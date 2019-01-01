package week5CodingAssignment;

public class App {

	public static void main(String[] args) {
		Logger astLogger = new AsteriskLogger();
		
		Logger spaceLogger = new SpacedLogger();
		
		// Test loggers "log" methods:
		astLogger.Log("Hello");
		spaceLogger.Log("Oh my");
		
		// Test loggers "error" methods:
		astLogger.Error("404 request not found");
		spaceLogger.Error("Oh boy things are messed up!");
		
		// Do I need to close?

	}

}
