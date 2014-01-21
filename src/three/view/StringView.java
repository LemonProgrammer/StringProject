package three.view;

import javax.swing.JOptionPane;

public class StringView
{
	/**
	 * @author Fernando Blanco
	 */
	public void displayRuntimeError()
	{
		int tempNumber;
		String tempString;
		
		JOptionPane.showMessageDialog(null,"Let's crash the program!");
		tempString = JOptionPane.showInputDialog(null, "Type in your favorite number!");
		tempNumber = Integer.parseInt(tempString);
		JOptionPane.showConfirmDialog(null, "Your favorite number is " + tempNumber);
	}
	
	public void usePassedValue(String currentValue)
	{
		JOptionPane.showMessageDialog(null, "You typed this to me: " + currentValue);
	}
	
	public String sendParameterMethod()
	{
//		When using a variable in a method, you must first assign it a value.
		String temp = null;
		
		JOptionPane.showMessageDialog(null, "Let's pass values!!");
		temp = JOptionPane.showInputDialog(null, "type in your favorite words");
		
		return temp;
	}
	
	public void moreInteractive(String userName, String responsePhrase)
	{
		
		
		
		JOptionPane.showMessageDialog(null, "Hi there, we are going to use tow parameters.");
		JOptionPane.showMessageDialog(null, userName + "Thinks that " + "\t" + responsePhrase + " is funny.");
		
		
	}
	
	public void testStringMethods()
	{
//		You will need to call your methods in here
//		Type java 7 api in google search, click first link.
		//testSubstring();
		testConcat();
		testIntern();
		testHashcode();
	}
	
	private void testSubstring()
	{
		JOptionPane.showMessageDialog(null, " Let's look at a substring" + "\n" + "or the part of a string");
		JOptionPane.showMessageDialog(null, "The string I am using is stored in testString");
		String testString = "supercalifrogilisticexpialidocius";
		JOptionPane.showMessageDialog(null, " Its value is: " + "\n" + testString);
		String temp = testString.substring(9, 13);
		JOptionPane.showMessageDialog(null, "Here it is from the 7th letter on: " + temp);
	}
	
	private void testConcat()
	{
		String cowMan = "manster";
		String testMan = cowMan.concat(" is a new word.");
		JOptionPane.showMessageDialog(null, "Here's the result: " + "\n" + testMan);
	}
	
	private void testIntern()
	{
		String cowBoy = "Strong";
		String cowGirl = "Tough";
		boolean testIntern = cowBoy.intern() == cowGirl.intern();
		JOptionPane.showMessageDialog(null, "Here's another result: " + "\n" + testIntern);
	}
	
	private void testHashcode()
	{
		String hashTest = "The hash slinging slasher!";
		int methodTest = hashTest.hashCode();
		JOptionPane.showMessageDialog(null, "Here's the final result of the Slasher: " + methodTest);
	}
}
