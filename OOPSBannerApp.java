/**
 * OOPSBannerApp UC7 - Banner Display Application
 *
 * Refactoring Note:
 * This iteration introduces a static inner class `CharacterPatternMap` to encapsulate
 * a character and its corresponding ASCII pattern. It uses constructors and getters
 * for data management, and a StringBuilder to efficiently construct the final output.
 *
 * @author Ulkesh
 * @version 7.0
 */
public class OOPSBannerApp {

    // UC7: Static inner class to encapsulate character data and patterns
    public static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for character
        public char getCharacter() {
            return character;
        }

        // Getter for pattern
        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {
        // Instantiate the character map objects
        CharacterPatternMap letterO = new CharacterPatternMap('O', new String[] {
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

        CharacterPatternMap letterP = new CharacterPatternMap('P', new String[] {
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

        CharacterPatternMap letterS = new CharacterPatternMap('S', new String[] {
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

        // Array representing the word "OOPS"
        CharacterPatternMap[] wordToPrint = {letterO, letterO, letterP, letterS};

        // UC7: Use StringBuilder to iterate and construct each line
        for (int i = 0; i < 9; i++) {
            StringBuilder lineBuilder = new StringBuilder();
            
            // Loop through each letter in the word array
            for (CharacterPatternMap letter : wordToPrint) {
                lineBuilder.append(letter.getPattern()[i]);
            }
            
            // Print the fully constructed line
            System.out.println(lineBuilder.toString());
        }
    }
}
