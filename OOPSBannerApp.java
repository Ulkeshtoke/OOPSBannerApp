import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp UC8 - Banner Display Application
 *
 * Refactoring Note:
 * This final iteration uses a HashMap to store and retrieve character patterns efficiently.
 * A centralized render function uses a StringBuilder within nested loops to
 * assemble and display the final banner, separating data storage from display logic.
 *
 * @author Ulkesh
 * @version 8.0
 */
public class OOPSBannerApp {

    // UC8: Centralized method to render any word using the pattern map
    public static void renderBanner(String word, Map<Character, String[]> patternMap) {
        // Outer loop: iterate through the 7 lines of the ASCII art height
        for (int i = 0; i < 9; i++) {
            StringBuilder lineBuilder = new StringBuilder();
            
            // Inner loop: iterate through each character in the target word
            for (char ch : word.toCharArray()) {
                // Retrieve the pattern from the HashMap
                String[] pattern = patternMap.get(ch);
                
                // Append the current line of the character to the builder
                lineBuilder.append(pattern[i]);
            }
            
            // Print the fully constructed row
            System.out.println(lineBuilder.toString());
        }
    }

    public static void main(String[] args) {
        // Create the HashMap to store our character data
        Map<Character, String[]> patternMap = new HashMap<>();
        
        // Populate the map with patterns
        patternMap.put('O', new String[] {
            "    ***    ",
            "  **   **  ",
            " **     ** ",
            " **     ** ",
            " **     ** ",
            " **     ** ",
            " **     ** ",
            "  **   **  ",
            "    ***    "
        });

        patternMap.put('P', new String[] {
            " *******    ",
            " **     **  ",
            " **      ** ",
            " **     **  ",
            " *******    ",
            " **         ",
            " **         ",
            " **         ",
            " **         "
        });

        patternMap.put('S', new String[] {
            "    ***** ",
            "  **      ",
            "**        ",
            " **       ",
            "   ***    ",
            "      **  ",
            "       ** ",
            "     **   ",
            "*****     "
        });

        // Execute the centralized function to display the banner
        renderBanner("OOPS", patternMap);
    }
}