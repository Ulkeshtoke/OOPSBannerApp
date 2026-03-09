public class OOPSBannerUC7 {

    public static void main(String[] args) {

        CharacterPattern o = new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPattern p = new CharacterPattern('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        CharacterPattern s = new CharacterPattern('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });

        CharacterPattern[] word = {o, o, p, s};

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            StringBuilder lineBuilder = new StringBuilder();

            for (CharacterPattern cp : word) {
                lineBuilder.append(cp.getPattern()[i]).append("   ");
            }

            banner[i] = lineBuilder.toString();
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }

    static class CharacterPattern {

        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }
}