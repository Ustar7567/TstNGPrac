package Practice;

import org.testng.annotations.Test;

//we can get data from H3a_DataPrvdrDPsSeparately class also. In this case, we are getting data from H3b_DataPrvdrDPsIfElseIf class

public class H3_DataPrvdrTest { 

	@Test(dataProvider = "DP", dataProviderClass = H3b_DataPrvdrDPsIfElseIf.class) 

	public void Test1(String un, String pwd) {
		System.out.println(un + "====" + pwd);
	}

	@Test(dataProvider = "DP", dataProviderClass = H3b_DataPrvdrDPsIfElseIf.class) // for each test, we need to provide
																					// the class name

	public void Test2(String un, String pwd, String tst) {
		System.out.println(un + "===" + pwd + "===" + tst);
	}

}
