package ClasesToAllUs;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

//if you want restart tests when fail. Write @AlyonaBoychuk.Test(retryAnalyzer = Retry.class)

public class Retry implements IRetryAnalyzer {
    private int actualRetry = 0;
    private static final int MAX_RETRY=2;
    @Override
    public boolean retry(ITestResult iTestResult) {
        if (actualRetry<MAX_RETRY) {
            actualRetry++;
            return true;
        } else {
            return false;
        }
    }
}
