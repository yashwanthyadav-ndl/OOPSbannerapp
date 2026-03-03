import java.util.*;

// Base class for character patterns
abstract class CharPattern {
    public abstract String[] getPattern();
}

// Specific character classes
class OPattern extends CharPattern {
    @Override
    public String[] getPattern() {
        return new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };
    }
}

class PPattern extends CharPattern {
    @Override
    public String[] getPattern() {
        return new String[]{
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        };
    }
}

class SPattern extends CharPattern {
    @Override
    public String[] getPattern() {
        return new String[]{
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        };
    }
}

public class OOPSBannerApp {
    
    // Map to store character classes
    private static final Map<Character, CharPattern> charMap = new HashMap<>();
    
    static {
        charMap.put('O', new OPattern());
        charMap.put('P', new PPattern());
        charMap.put('S', new SPattern());
    }
    
    // Function to render a word
    public static void renderWord(String word) {
        word = word.toUpperCase();
        for (int row = 0; row < 5; row++) {
            StringBuilder line = new StringBuilder();
            for (char ch : word.toCharArray()) {
                CharPattern cp = charMap.get(ch);
                if (cp != null) {
                    line.append(cp.getPattern()[row]).append("  ");
                } else {
                    line.append("     ").append("  "); // blank for unsupported chars
                }
            }
            System.out.println(line);
        }
    }
    
    public static void main(String[] args) {
        renderWord("OOPS"); // double O included
    }
}