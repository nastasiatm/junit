/**
 * Created by anastasia on 12.03.17.
 */

import org.junit.Test;
import junit.framework.Assert.*;

public class Test {

    private void testMultiply() {
        // Тестируемый класс
        Function tester = new Function();

        // Проверяемый метод
        assertEquals("10 x 5 must be 50", 50, tester.multiply(10, 5));
    }
}
