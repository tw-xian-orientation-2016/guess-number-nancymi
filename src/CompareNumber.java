public class CompareNumber {

    public String compare(String input, String answer) {

        int A = 0, B = 0;

        for (int i = 0; i < answer.length(); i ++) {
            char c = answer.charAt(i);
            if (input.charAt(i) == c) {
                A ++;
            } else if (input.contains(String.valueOf(c))) {
                B ++;
            }
        }

        return A + "A" + B + "B";
    }
}
