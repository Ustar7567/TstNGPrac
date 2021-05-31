package Listeners;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;
@Test(groups="India")
public class A_TestDemoListeners {
	
	@Test(groups="south")
	public void Bangalore() {
		System.out.println("This is Blr");
		Assert.assertTrue(false); //Failing the test on purpose
	}
	@Test(groups="south")
	public void Chennai() {
		System.out.println("This is Chni");
	}
	@Test(groups="north")
	public void Mumbai() {
		System.out.println("This is Mmb");
	}
	@Test(groups="north")
	public void Noida() {
		System.out.println("This is Noida");
	}
	@Test(groups="north")
	public void Pune() {
		System.out.println("This is Pune");
	}

}
