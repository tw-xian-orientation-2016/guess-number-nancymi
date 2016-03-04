/**
 * Created by nancymi on 16/3/4.
 */
public class Guess {

    private final String answer;

    private CompareNumber compareNumber;

    public Guess(AnswerGenerator answerGenerator, CompareNumber compareNumber) {
        this.answer = answerGenerator.generate();
        this.compareNumber = compareNumber;
    }

    public String run(String guess) {

        String guessAnswer = compareNumber.compare(guess, answer);

        return guessAnswer;
    }
}
