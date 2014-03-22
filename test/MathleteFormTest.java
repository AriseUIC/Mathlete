import static org.junit.Assert.*;

import java.awt.event.ActionEvent;

import org.junit.Test;


public class MathleteFormTest {

	@Test
	public void testIscharacter_char_pass() {
		MathleteForm mf=new MathleteForm();
		char c='c';
		boolean result = mf.IsCharacter(c);
		assertEquals(true, result);
	}
	
	@Test
	public void testIscharacter_lowerbound_symbol_fail() {
		MathleteForm mf=new MathleteForm();
		char c='#';
		boolean result = mf.IsCharacter(c);
		assertEquals(false, result);
	}
	
	@Test
	public void testIscharacter_upperbound_symbol_fail() {
		MathleteForm mf=new MathleteForm();
		char c='{';
		boolean result = mf.IsCharacter(c);
		assertEquals(false, result);
	}
	
	@Test
	public void testIsnumber_pass() {
		MathleteForm mf = new MathleteForm ();
		char c = '7';
		boolean result = mf.IsNumber(c);
		assertEquals(true, result);
	}
	
	@Test
	public void testkeyReleased_pass() {
		MathleteForm mf = new MathleteForm ();
		char c = '7';
		boolean result = mf.IsNumber(c);
		assertEquals(true, result);
	}
	@Test
	public void calcTester()
	{
		MathleteForm mf=new MathleteForm();
		MathleteForm.CalculatorInputTextField.setText("5+6");
		
		mf.CalculatorInputTextFieldActionPerformed(new ActionEvent(mf, 2, "5+6"));
		
	}
}