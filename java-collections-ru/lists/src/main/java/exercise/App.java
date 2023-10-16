package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String text, String word) {
        word = word.toLowerCase();
        text = text.toLowerCase();
        List<String> chars = new ArrayList<>(List.of(text.split("", 0)));
        for (int i = 0; i < word.length(); i++) {
            if (chars.contains(String.valueOf(word.charAt(i)))) {
                chars.remove(String.valueOf(word.charAt(i)));
            } else {
                return false;
            }
        }
        return true;
    }
}
//END
