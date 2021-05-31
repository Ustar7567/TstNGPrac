package Practice;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class J3_RetryFailedTest_RetryListener implements IAnnotationTransformer{

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		annotation.setRetryAnalyzer(J1_RetryFailedTestCase_RetryClass.class);
		//here, provide the class which is implementing IRetryAnalyzer
		//Run the test from J_RetryFailedTest.xml
	}

	
	

}
