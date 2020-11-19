import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierTest {

//implement tests to test Sudokuverifier with boundary values.  Use templates from Task 1 to derive and document test cases.
	
// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891

SudokuVerifier v = new SudokuVerifier();
	
	@Test
	public void testcase1correctSudoku() {
		int a = v.verify("417369825632158947958724316825437169791586432346912758289643571573291684164875293");
		assertEquals("correct string", a, 0);
		
	}
	
	@Test
	public void testcase2tooShortString() {
		int a = v.verify("41736982563215894795872431682543716979158643234691275828964357157329168416487529");
		assertEquals("too short String", a, -1);
		
	}
	
	@Test
	public void testcase3tooLongString() {
		int a = v.verify("4173698256321589479587243168254371697915864323469127582896435715732916841648752931");
		assertEquals("too long String", a, -1);
		
	}
	
	@Test
	public void testcase4notDigit() {
		int a = v.verify("x17369825632158947958724316825437169791586432346912758289643571573291684164875293");
		assertEquals("String contains other than digits", a, 1);
		
	}
	
	@Test
	public void testcase5zeroDigit() {
		int a = v.verify("017369825632158947958724316825437169791586432346912758289643571573291684164875293");
		assertEquals("String contains zero", a, -1);
		
	}
	
	@Test
	public void testcase6incorrectSubgrid() {
		int a = v.verify("447369825632158947958724316825437169791586432346912758289643571573291684164875293");
		assertEquals("incorrect subgrid", a, -2);
		
	}
	
	@Test
	public void testcase7incorrectRow() {
		int a = v.verify("417469825632158947958723316825437169791586432346912758289643571573291684164875293");
		assertEquals("incorrect row", a, -3);
		
	}
	
	@Test
	public void testcase8incorrectColumn() {
		int a = v.verify("417369825632158947958724316425837169791546832386912754289643571573291684164875293");
		assertEquals("incorrect column", a, -4);
		
	}
	
}
