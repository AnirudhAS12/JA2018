package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	
	@Test
	public void testSoft() {
		
		SoftAssert sa = new SoftAssert();
		System.out.println("soft test started");
		sa.assertEquals(12, 14, "count doesnt match");
		System.out.println("soft test completed");
		sa.assertAll(); //this is required to make above code valid
		
		
	}

	@Test
	public void testHardAssert() {
		
		
		System.out.println("hard test started");
		Assert.assertEquals(12, 14,"count doesnt match");
		System.out.println("hard test completed");
		
		
	}
}
