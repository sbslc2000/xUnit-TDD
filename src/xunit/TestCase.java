package src.xunit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 일반화된 테스트케이스는 이 클래스를 상속해야 한다.
 * 생성자에 이름을 넣고 run을 호출하면 테스트 메서드를 실행한다.
 */
public class TestCase {
    protected final String name;

    /**
     * 테스트 대상 메서드 이름을 받는다.
     *
     * @param name
     */
    public TestCase(String name) {
        this.name = name;
    }

    public TestResult run() {
        //테스트 메서드 호출 전에 setUp이 호출되어야 한다.
        setUp();

        try {
            Method method = getClass().getMethod(name);
            method.invoke(this);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }

        tearDown();
        return new TestResult();
    }

    public void tearDown() {

    }

    public void setUp() {
    }
}
