/**
 * Created by anastasia on 12.03.17.
 */
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunctionTest {

    @Test
    public void testMultiply() {
        // Тестируемый класс
        Function tester = new Function();

        // Проверяемый метод
        assertEquals("10 x 5 must be 50", 15, tester.calA(10, 5));
    }
}
