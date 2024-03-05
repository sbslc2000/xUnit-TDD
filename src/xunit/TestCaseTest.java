package src.xunit;

/**
 * 테스트케이스를 테스트하는 테스트케이스
 */
public class TestCaseTest extends TestCase {
    /**
     * @param name
     */
    public TestCaseTest(String name) {
        super(name);
    }

    /**
     * 테스트케이스를 상속한 클래스의 run이 정상적으로 수행되어야 한다.
     */
    public void testTemplateMethod() {
        WasRun wasRun = new WasRun("testMethod");
        wasRun.run();
        Assert.assertEquals("setUp testMethod tearDown", wasRun.log);
    }

    public void testResult() {
        WasRun wasRun = new WasRun("testMethod");
        TestResult result = wasRun.run();
        Assert.assertEquals("1 run, 0 failed", result.getSummary());
    }

    public void testFailedResultFormatting() {
        TestResult result = new TestResult();
        result.testStarted();
        result.testFailed();
        Assert.assertEquals("1 run, 1 failed", result.getSummary());
    }

}
