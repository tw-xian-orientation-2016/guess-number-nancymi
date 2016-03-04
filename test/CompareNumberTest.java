import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by nancymi on 16/3/4.
 */
public class CompareNumberTest {

    CompareNumber compareNumber;

    @Before
    public void setUp() {
        compareNumber = new CompareNumber();
    }

    @Test
    public void compare_return_4A0B_when_all_matches() {
        String compareAnswer = compareNumber.compare("1234", "1234");
        assertEquals(compareAnswer, "4A0B");
    }

    @Test
    public void compare_return_0A4B_when_all_contains() {
        String compareAnswer = compareNumber.compare("1234", "4321");
        assertEquals(compareAnswer, "0A4B");
    }

    @Test
    public void compare_return_0A0B_when_neither_matches_nor_contains() {
        String compareAnswer = compareNumber.compare("1234", "5678");
        assertEquals(compareAnswer, "0A0B");
    }

}