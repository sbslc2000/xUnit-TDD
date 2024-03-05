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

    WasRun wasRun;

    /**
     * TestCaseTest 역시 TestCase를 상속받은 것이므로
     * setUp을 통해 초기 로직을 수행 가능
     */
    @Override
    public void setUp() {
        wasRun = new WasRun("testMethod");
    }

    /**
     * 테스트케이스를 상속한 클래스의 run이 정상적으로 수행되어야 한다.
     */
    public void testRunning() {
        Assert.assertEquals(false, wasRun.wasRun);
        wasRun.run();
        Assert.assertEquals(true, wasRun.wasRun);
    }

    public void testSetUp() {
        Assert.assertEquals(false, wasRun.wasSetUp);
        wasRun.run();
        Assert.assertEquals("setUp", wasRun.log);
        Assert.assertEquals(true, wasRun.wasSetUp);
    }
}
