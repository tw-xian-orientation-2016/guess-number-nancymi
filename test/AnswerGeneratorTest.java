import org.junit.Test;

import java.util.Random;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AnswerGeneratorTest {

    @Test
    public void generate_when_return_number() throws Exception {
        Random random = mock(Random.class);
        when(random.nextInt()).thenReturn(1, 2, 3, 4);

        AnswerGenerator answerGenerator = new AnswerGenerator(random);
        String answer = answerGenerator.generate();

        assertThat(answer, is("1234"));
    }

    @Test
    public void generate_when_return_number_no_repeat() throws Exception {
        Random random = mock(Random.class);
        when(random.nextInt()).thenReturn(1, 2, 4, 2, 4, 5, 2, 3, 6);

        AnswerGenerator answerGenerator = new AnswerGenerator(random);
        String answer = answerGenerator.generate();

        assertThat(answer, is("1245"));
    }
}