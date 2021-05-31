package Practice;

import org.testng.annotations.DataProvider;

public class H3a_DataPrvdrDPsSeparately {
	
@DataProvider
	public Object[][] DtaPrvdr1() {
		return new Object[][] { { "un1", "pwd1" }, { "un2", "pwd2" }, { "un3", "pwd3" } };

	}

@DataProvider
public Object[][] DtaPrvdr2() {
	return new Object[][] {{"un1","pw1","tst1"},{"un2","pw2","tst2"},{"un3","pw3","tst3"}};
}

}
