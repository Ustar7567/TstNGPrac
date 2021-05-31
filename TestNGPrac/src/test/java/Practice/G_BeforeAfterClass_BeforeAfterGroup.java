package Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class G_BeforeAfterClass_BeforeAfterGroup {
	
	@BeforeClass
	public static void b4cls() {
		System.out.println("b4 cls");
	}
	@AfterClass
	public static void afcls() {
		System.out.println("aft cls");
	}
	
	@BeforeGroups(value="mdl") //Run as -> run config -> groups
	public static void bfgrp() {
		System.out.println("b4 grp");
	}
	@AfterGroups(value="mdl")
	public static void afgrp() {
		System.out.println("aft grp");
	}
	
	@Test(groups="first")
	public static void aone() {
		System.out.println("first");
	}
	
	@Test(groups="mdl")
	public static void btwo() {
		System.out.println("mdl1");
	}
	
	@Test(groups="mdl")
	public static void cthree() {
		System.out.println("mdl2");
	}
	
	@Test(groups="last")
	public static void dfour() {
		System.out.println("last");
	}

}
