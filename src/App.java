import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static String getInput() {
        Scanner input = new Scanner(System.in);
        String digits = "";
        boolean inRange;

        do {
            inRange = true;
            System.out.print("Give me at most 4 digits between 2 and 9: ");
            digits = input.nextLine();

            for (int i = 0; i < digits.length(); i++) {
                if (digits.charAt(i) < '2' || digits.charAt(i) > '9') {
                    inRange = false;
                }
            }
        } while (digits.length() > 4 || !inRange);

        input.close();

        return digits;
    }

    public static void listCombinations(ArrayList<String> combinations) {
        System.out.println("Combinations: ");
        for (var combination : combinations) {
            System.out.print(combination + " ");
        }
    }

    public static void main(String[] args) {
        String digits = getInput();
        Combinator c = new Combinator();
        ArrayList<String> combinations = c.getCombinations(digits);
        listCombinations(combinations);
    }
}