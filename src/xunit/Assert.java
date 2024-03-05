package src.xunit;

/**
 * Java의 assert 역시 확실한 검증 방법이지만, 왜 실패했는지에 대한 구체적인 정보를 얻기 어렵다.
 * 따라서 별도의 Assert 클래스 생성
 */
public class Assert {
    public static void assertEquals(Object expected, Object actual) {
        if (!expected.equals(actual))
            throw new AssertionError("expected <" + expected + "> but was <" + actual+">");
    }
}
