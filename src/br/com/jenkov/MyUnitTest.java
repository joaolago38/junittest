package br.com.jenkov;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyUnitTest {
	@Test
	public void testConcatenate() {
		MyUnit myUnit = new MyUnit();
		String result = myUnit.concatenate("one", "two");
		assertEquals("onetwo",result);
	}
}
