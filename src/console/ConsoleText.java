package console;

public class ConsoleText {
    public static String formatText(String text, String foregroundColor, String backgroundColor) {
        // Default to white text and black background if colors are not provided
        foregroundColor = (foregroundColor != null) ? foregroundColor : Colors.ANSI_RESET;
        backgroundColor = (backgroundColor != null) ? backgroundColor : Colors.ANSI_RESET;

        // Format the text with specified colors
        return foregroundColor + backgroundColor + text + Colors.ANSI_RESET;
    }

    public static String formatText(String text, String foregroundColor) {
        // Default to white text and black background if colors are not provided
        foregroundColor = (foregroundColor != null) ? foregroundColor : Colors.ANSI_RESET;

        // Format the text with specified colors
        return foregroundColor + text + Colors.ANSI_RESET;
    }

    public static String centerText(String text, int lengthOfSpace) {
        String[] textLines = text.split("\\n");
        StringBuilder centeredText = new StringBuilder();
        for (String textLine : textLines){
            centeredText.append(String.format("%" + lengthOfSpace / 2 + "s", String.format("%" + ((lengthOfSpace + textLine.length()) / 2) + "s", textLine))).append("\n");
        }
        return centeredText.toString();
    }

    public static String addBorders(String text) {
        String[] splitText = text.split("\\n");
        int lengthOfText = 0;
        for (String splitTextPart : splitText) {
            lengthOfText = Math.max(splitTextPart.length(), lengthOfText);
        }
        return buildTextBorder(splitText, lengthOfText);
    }

    public static String addBorders(String text, int lengthOfText) {
        String[] splitText = text.split("\\n");
        return buildTextBorder(splitText, lengthOfText);
    }

    private static String buildTextBorder(String[] splitText, int lengthOfText) {
        StringBuilder textBuilder = new StringBuilder();
        addTopOrBottom(textBuilder, lengthOfText);
        for (String splitTextPart : splitText) {
            textBuilder.append("| ").append(splitTextPart).append(" |\n");
        }
        addTopOrBottom(textBuilder, lengthOfText);
        return textBuilder.toString();
    }

    public static void addTopOrBottom(StringBuilder textBuilder, int lengthOfText) {
        // Add 4 because of the chars we are adding with the vertical border
        for (int i = 0; i < lengthOfText + 4; i++) {
            textBuilder.append((i == 0 || i == lengthOfText + 3) ? "+" : "-");
            if (i == lengthOfText + 3) {
                textBuilder.append("\n");
            }
        }
    }

    public static void printIndentedText(String text, int indentSize, int wordsPerLine) {
        String[] words = text.split(" ");
        int wordCount = 0;

        for (String word : words) {
            if (wordCount == 0) {
                for (int i = 0; i < indentSize; i++) {
                    System.out.print(" ");
                }
            }

            System.out.print(word + " ");
            wordCount++;

            if (wordCount == wordsPerLine) {
                System.out.println();
                wordCount = 0;
            }
        }
    }

    // Add feature to add text parts that needs to be beside each other. And specify overload with distance between elements.
    // returns array of strings to be printf'ed
}
