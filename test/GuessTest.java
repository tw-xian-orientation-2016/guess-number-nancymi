import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GuessTest {

    @Test
    public void run_when_give_answer_then_return_xAxB() throws Exception {

        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn("1234");

        CompareNumber compareNumber = mock(CompareNumber.class);
        when(compareNumber.compare("5231", "1234")).thenReturn("2A0B");

        Guess guess = new Guess(answerGenerator, compareNumber);
        assertThat(guess.run("5231"), is("2A0B"));

    }

}