import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Combinator {
    private Map<Character, String> digitToLetters;

    public Combinator() {
        digitToLetters = new HashMap<Character, String>();
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");
    }

    public ArrayList<String> getCombinations(String digits) {
        ArrayList<String> combinations = new ArrayList<String>();

        if (digits.length() == 1) {
            char[] letters = digitToLetters.get(digits.charAt(0)).toCharArray();
            for (char a : letters) {
                combinations.add(Character.toString(a));
            }
        } 
        else {
            for (int i = 0; i < digits.length(); i++) {
                char[] firstHalf = digitToLetters.get(digits.charAt(i)).toCharArray();

                for (int j = i + 1; j < digits.length(); j++) {
                    char[] secondHalf = digitToLetters.get(digits.charAt(j)).toCharArray();

                    for (char a : firstHalf) {
                        for (char b : secondHalf) {
                            String c = Character.toString(a) + Character.toString(b);

                            if (!combinations.contains(c))
                                combinations.add(c);
                        }
                    }
                }
            }
        }

        Collections.sort(combinations);

        return combinations;
    }
}
