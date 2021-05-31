package Practice;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class H3b_DataPrvdrDPsIfElseIf {//Single data-provider for multiple methods in our test case
	
	@DataProvider
	
	public Object[][] DP(Method m){
		
		Object[][] testdata=null;
			
		if(m.getName().equals("Test1")) {
			testdata= new Object[][] {{ "un1", "pwd1" }, { "un2", "pwd2" }, { "un3", "pwd3" }};
		}
		else if(m.getName().equals("Test2")) {
			testdata= new Object[][] {{"un1","pw1","tst1"},{"un2","pw2","tst2"},{"un3","pw3","tst3"}};
		}
			
		return testdata;		
	}

}
