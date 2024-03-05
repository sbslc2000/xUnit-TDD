package src.xunit;

public class TestResult {
    int runCount = 0;
    int errorCount;

    public void testStarted() {
        runCount++;
    }

    public void testFailed() {
        errorCount++;
    }

    public String getSummary() {
        return runCount + " run, " + errorCount + " failed";
    }
    
}
