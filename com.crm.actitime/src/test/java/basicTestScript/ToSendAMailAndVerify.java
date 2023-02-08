package basicTestScript;

import org.testng.annotations.Test;
import genericUtility.BaseClass;

public class ToSendAMailAndVerify extends BaseClass{

	@Test
	public void sendAMailAndVerifyTest() {
		System.out.println("The Mail has been sent and verified");
	}
}

/*
*To email a report of a test
*first run the testcript
*then refresh the project
*a test-output folder will be created automatically
*open it and click on emailable-report.html
*this is the test report which you can attach to the email
*/
