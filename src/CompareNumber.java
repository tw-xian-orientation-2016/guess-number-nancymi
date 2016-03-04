public class CompareNumber {

    public String compare(String input, String answer) {

        int A = 0, B = 0;

        for (int index = 0; index < answer.length(); index ++) {
            char indexVal = answer.charAt(index);
            if (input.charAt(index) == indexVal) {
                A ++;
            } else if (input.contains(String.valueOf(indexVal))) {
                B ++;
            }
        }

        return A + "A" + B + "B";
    }
}
