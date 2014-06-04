package test.nestle.Suite;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CreateAccount {

	@Test(groups = {"create"})
    @Parameters({"browser"})
    public void testMe(String param) {
        System.out.println("testMe.param: " + param);
    }
	
 
}