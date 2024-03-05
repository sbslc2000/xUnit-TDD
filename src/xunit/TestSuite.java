package src.xunit;

import java.util.ArrayList;
import java.util.List;

public class TestSuite {

    List<WasRun> tests = new ArrayList<>();

    public void add(WasRun testBrokenMethod) {
        tests.add(testBrokenMethod);
    }

    public void run(TestResult result) {
        tests.forEach(t -> t.run(result));
    }
}
