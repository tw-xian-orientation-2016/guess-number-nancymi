/**
 * Created by nancymi on 16/3/4.
 */
public class CompareNumber {

    public String compare(String forCompareNumber, String compareNumber) {
        StringBuilder answer = new StringBuilder("");
        int aNum = 0, bNum = 0;

        for (int i = 0; i < compareNumber.length(); i ++) {
            char c = compareNumber.charAt(i);
            if (forCompareNumber.charAt(i) == c) {
                aNum ++;
            } else if (forCompareNumber.contains(String.valueOf(c))) {
                bNum ++;
            }
        }
        answer.append(aNum + "A" + bNum + "B");

        return answer.toString();
    }
}
