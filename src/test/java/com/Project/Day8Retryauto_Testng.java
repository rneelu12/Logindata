package com.Project;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Day8Retryauto_Testng implements IRetryAnalyzer {
	int a = 0;
	int b = 5;

	@Override
	public boolean retry(ITestResult result) {
		if (a < b) {
			a++;

			return true;
		}
		return false;
	}
}
