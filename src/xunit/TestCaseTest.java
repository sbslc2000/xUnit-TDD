package src.xunit;

/**
 * 테스트케이스를 테스트하는 테스트케이스
 */
public class TestCaseTest extends TestCase{
    /**
     * @param name
     */
    public TestCaseTest(String name) {
        super(name);
    }

    /**
     * 테스트케이스를 상속한 클래스의 run이 정상적으로 수행되어야 한다.
     */
    public void testRunning() {
        WasRun wasRun = new WasRun("testMethod");
        Assert.assertEquals(false, wasRun.wasRun);
        wasRun.run();
        Assert.assertEquals(true, wasRun.wasRun);
    }
}
