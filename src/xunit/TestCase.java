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
     *
     * @param name
     */
    public TestCase(String name) {
        this.name = name;
    }

    public void run() {
        try {
            Method method = getClass().getMethod(name);
            method.invoke(this);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
