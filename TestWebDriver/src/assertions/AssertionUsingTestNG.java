package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionUsingTestNG {
	
	@Test
	public void comparestrings() {
		String myName = "Anirudh";
		Assert.assertTrue(myName.contains("Anirudh"));
	}
	
	@Test
	public void comparestrings2() {
		String myName = "Anirudh";
		Assert.assertTrue(myName.contains("Dhoni"));
	}
	
	@Test
	public void Test() {
	System.out.println("Test started");
	Assert.assertEquals(12, 13, "Not matching! A Bug");
	System.out.println("Test ended");
	
	}
	

}
