package assgnment.sri;

import static org.junit.Assert.*;  
import org.junit.Test;  

/**
 * 
 * @author srinivas
 * Unit test for NumbersToWords
 *
 */
public class NumbersToWordsTest {

	@Test
	public void testConvertGivenNumberToWords() throws Exception {
		
		assertEquals("one",NumbersToWords.convertGivenNumberToWords(1));
		assertEquals("twenty one",NumbersToWords.convertGivenNumberToWords(21));
		assertEquals("one hundred five",NumbersToWords.convertGivenNumberToWords(105));
		assertEquals("fifty six million nine hundred forty five thousand seven hundred eighty one",NumbersToWords.convertGivenNumberToWords(56945781));
		assertEquals("nine hundred ninety nine million nine hundred ninety nine thousand nine hundred ninety nine",NumbersToWords.convertGivenNumberToWords(999999999));
		assertEquals("one billion two hundred thirty four million five hundred sixty seven thousand height hundred ninety",NumbersToWords.convertGivenNumberToWords(1234567890));
	}

	@Test
	public void testConvertNumberToWords() throws Exception {
		
		assertEquals("one",NumbersToWords.convertNumberToWords(1));
		assertEquals("twenty one",NumbersToWords.convertNumberToWords(21));
		assertEquals("one hundred five",NumbersToWords.convertNumberToWords(105));
		assertEquals("fifty six million nine hundred forty five thousand seven hundred eighty one",NumbersToWords.convertNumberToWords(56945781));
		assertEquals("nine hundred ninety nine million nine hundred ninety nine thousand nine hundred ninety nine",NumbersToWords.convertNumberToWords(999999999));
		assertEquals("one billion two hundred thirty four million five hundred sixty seven thousand height hundred ninety",NumbersToWords.convertNumberToWords(1234567890));
	}
	
	@Test
	public void testConvert1To99NumbersToWords() throws Exception {
		
		assertEquals("one",NumbersToWords.convert1To99NumbersToWords(1));
		assertEquals("twenty one",NumbersToWords.convert1To99NumbersToWords(21));
		
	}
	
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void testConvert1To99NumbersToWordsNegitive() throws Exception {
		
		assertEquals("one",NumbersToWords.convert1To99NumbersToWords(1));
		assertEquals("twenty one",NumbersToWords.convert1To99NumbersToWords(21));
		assertEquals("one hundred",NumbersToWords.convert1To99NumbersToWords(100));
		assertEquals("one hundred five",NumbersToWords.convert1To99NumbersToWords(105));
	}
	
}
