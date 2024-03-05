package src.xunit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestSuite implements Test {

    List<Test> tests = new ArrayList<>();

    public TestSuite(Class<? extends Test> testClass) {
        Arrays.stream(testClass.getDeclaredMethods())
                .filter(m -> m.isAnnotationPresent(src.xunit.annotation.Test.class))
                .forEach(m -> {
                            try {
                                add(testClass.getConstructor(String.class).newInstance(m.getName()));
                            } catch (Exception e) {
                                throw new RuntimeException();
                            }
                        }
                );
    }

    public TestSuite() {
    }

    public void add(Test test) {
        tests.add(test);
    }

    public void run(TestResult result) {
        tests.forEach(t -> t.run(result));
    }
}
