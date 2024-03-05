package src.xunit;

public class WasRun extends TestCase {
    public boolean wasRun;
    public boolean wasSetUp;
    public String log;

    public WasRun(String name) {
        super(name);
    }

    public void testMethod() {
        wasRun = true;
        log += " testMethod";
    }

    @Override
    public void setUp() {
        wasSetUp = true;
        log = "setUp";
    }
}
