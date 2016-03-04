import org.junit.Test;

import java.util.Random;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class IntegrationGuessTest {

    @Test
    public void integrate_run_when_give_match_answer_then_return_4A0B() throws Exception {
        Random random = mock(Random.class);
        when(random.nextInt()).thenReturn(1, 2, 3, 4, 5, 8, 9);

        AnswerGenerator answerGenerator = new AnswerGenerator(random);
        CompareNumber compareNumber = new CompareNumber();

        Guess guess = new Guess(answerGenerator, compareNumber);

        assertThat(guess.run("1234"), is("4A0B"));
    }

    @Test
    public void integrate_run_when_give_no_contain_or_match_answer_then_return_0A4B() throws Exception {
        Random random = mock(Random.class);
        when(random.nextInt()).thenReturn(1, 2, 3, 1, 4);

        AnswerGenerator answerGenerator = new AnswerGenerator(random);
        CompareNumber compareNumber = new CompareNumber();

        Guess guess = new Guess(answerGenerator, compareNumber);

        assertThat(guess.run("4321"), is("0A4B"));
    }

    @Test
    public void integrate_run_when_give_match_answer_then_return_2A2B() throws Exception {
        Random random = mock(Random.class);
        when(random.nextInt()).thenReturn(1, 2, 2, 1, 3, 4);

        AnswerGenerator answerGenerator = new AnswerGenerator(random);
        CompareNumber compareNumber = new CompareNumber();

        Guess guess = new Guess(answerGenerator, compareNumber);

        assertThat(guess.run("1324"), is("2A2B"));
    }
}
