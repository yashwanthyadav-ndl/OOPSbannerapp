import java.util.*;

public class BannerApp {
    
    // Map to store character patterns
    private static final Map<Character, String[]> charMap = new HashMap<>();
    
    static {
        charMap.put('O', new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        });
        charMap.put('P', new String[]{
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        });
        charMap.put('S', new String[]{
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        });
    }
    
    // Function to render a word
    public static void renderWord(String word) {
        word = word.toUpperCase();
        for (int row = 0; row < 5; row++) {
            StringBuilder line = new StringBuilder();
            for (char ch : word.toCharArray()) {
                String[] pattern = charMap.getOrDefault(ch, new String[]{"     ","     ","     ","     ","     "});
                line.append(pattern[row]).append("  "); // spacing between letters
            }
            System.out.println(line);
        }
    }
    
    public static void main(String[] args) {
        renderWord("OOPS");
    }
}