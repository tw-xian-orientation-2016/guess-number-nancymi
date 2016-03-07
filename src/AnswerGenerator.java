import java.util.Random;

public class AnswerGenerator {

    private Random random;

    public AnswerGenerator(Random random) {
        this.random = random;
    }

    public String generate() {
        String answer = "";

        while (answer.length() < 4) {
            String nextIntStr;
            do  {
                nextIntStr = String.valueOf(random.nextInt());
            } while (answer.contains(nextIntStr));

            answer += String.valueOf(nextIntStr);
        }

        return answer;
    }

}
