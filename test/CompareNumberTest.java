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
    public void giveNumberThenReturn4A0B() {
        String compareAnswer = compareNumber.compare("1234", "1234");
        assertEquals(compareAnswer, "4A0B");
    }

    @Test
    public void giveNumberThenReturn0A4B() {
        String compareAnswer = compareNumber.compare("1234", "4321");
        assertEquals(compareAnswer, "0A4B");
    }

    @Test
    public void giveNumberThenReturn0A0B() {
        String compareAnswer = compareNumber.compare("1234", "5678");
        assertEquals(compareAnswer, "0A0B");
    }

}