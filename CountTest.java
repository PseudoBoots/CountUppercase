import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class CountTest {

	@Test
	public void test() {
		CountUppercase count = new CountUppercase();
		String letters = "";
		char upperCh = 'A';
		char lowerCh = 'a';
		
		for(int i = 0; i < 26; i++)
		{
			assertEquals(i, count.countCaps(letters));
			letters += upperCh;
			letters += lowerCh;
			letters += " ";
			upperCh++;
			lowerCh++;
		}
	}

}
