package Project.Utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTest implements IRetryAnalyzer {
    private int retryCount = 0;
    private static final int maxRetryCount = 2;  // Set max retry attempts

    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            System.out.println("Retrying failed test: " + result.getName() + " | Attempt " + (retryCount + 1));
            return true;  // Retry test


        }
        return false;  // Stop retrying after max attempts
    }
}
