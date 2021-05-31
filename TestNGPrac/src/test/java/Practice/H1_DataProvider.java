package Practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class H1_DataProvider {

	@Test(dataProvider="dataSet1") //Test for first data provider(runs for 4 sets of data cz 4 rows r present)
	public void test1(String username, String password) {
		
		System.out.println(username+"========="+password);

	}
	@Test(dataProvider="dataSet2") //Test for second data provider(runs for 3 sets of data cz 3 rows r present)
	public void test2(String username, String password, String test) {
		System.out.println(username+"==="+password+"==="+test);
	}

	@DataProvider
	public Object[][] dataSet1() {

		Object[][] dataSet1 = new Object[4][2];

		// first row
		dataSet1[0][0] = "user1";
		dataSet1[0][1] = "pass1";

		// second row
		dataSet1[1][0] = "user2";
		dataSet1[1][1] = "pass2";

		// first row
		dataSet1[2][0] = "user3";
		dataSet1[2][1] = "pass3";

		// first row
		dataSet1[3][0] = "user4";
		dataSet1[3][1] = "pass4";

		return dataSet1;

	}
	
	@DataProvider
	public Object[][] dataSet2(){ //recommended process cz we don't hv to specify number of rows n columns.Easy to update or delete
		
		return new Object[][] {{"username1","password1","test1"},
			{"username2","password2","test2"},
			{"username3","password3","test3"}};
		}
		
	}


