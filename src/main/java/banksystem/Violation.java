package banksystem;

public class Violation {
	private int x; // Error: Tab character used instead of spaces

    public void testMethod() {
        int LongVariableNameThatExceedsTheStandardLengthLimitForLineLengthCheckingInCheckstyleConfiguration = 10; // Error: Line too long
        System.out.println(x);
    }
}
