package SeleniumTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
	/*@BeforeTest
	public void login()  {
		System.out.println("Login Scussesfully");
	}
    @AfterTest
	public void logout()  {
		System.out.println("Logout Scussesfully");
	}*/
	@Test(priority=1)
	public void accuntsummary()  {
		System.out.println("Accuntsummary Scussesfully");
	}
	@Test(priority=2)
	public void fundtransfer()  {
		System.out.println("fundtransfer Scussesfully");
	}
	@Test(priority=3)
	public void Billpayment()  {
		System.out.println("BillPayment Scussesfully");
	} 
}
