package console;

public class Colors {
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_MAGENTA = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BRIGHT_BLACK = "\u001B[90m";
    public static final String ANSI_BRIGHT_RED = "\u001B[91m";
    public static final String ANSI_BRIGHT_GREEN = "\u001B[92m";
    public static final String ANSI_BRIGHT_YELLOW = "\u001B[93m";
    public static final String ANSI_BRIGHT_BLUE = "\u001B[94m";
    public static final String ANSI_BRIGHT_MAGENTA = "\u001B[95m";
    public static final String ANSI_BRIGHT_CYAN = "\u001B[96m";
    public static final String ANSI_BRIGHT_WHITE = "\u001B[97m";

    // Background colors
    public static final String ANSI_BG_BLACK = "\u001B[40m";
    public static final String ANSI_BG_RED = "\u001B[41m";
    public static final String ANSI_BG_GREEN = "\u001B[42m";
    public static final String ANSI_BG_YELLOW = "\u001B[43m";
    public static final String ANSI_BG_BLUE = "\u001B[44m";
    public static final String ANSI_BG_MAGENTA = "\u001B[45m";
    public static final String ANSI_BG_CYAN = "\u001B[46m";
    public static final String ANSI_BG_WHITE = "\u001B[47m";
    public static final String ANSI_BG_BRIGHT_BLACK = "\u001B[100m";
    public static final String ANSI_BG_BRIGHT_RED = "\u001B[101m";
    public static final String ANSI_BG_BRIGHT_GREEN = "\u001B[102m";
    public static final String ANSI_BG_BRIGHT_YELLOW = "\u001B[103m";
    public static final String ANSI_BG_BRIGHT_BLUE = "\u001B[104m";
    public static final String ANSI_BG_BRIGHT_MAGENTA = "\u001B[105m";
    public static final String ANSI_BG_BRIGHT_CYAN = "\u001B[106m";
    public static final String ANSI_BG_BRIGHT_WHITE = "\u001B[107m";

    // Reset
    public static final String ANSI_RESET = "\u001B[0m";

    public static String getFontColorCode(String color) {
        return switch (color.toLowerCase()) {
            case "black" -> ANSI_BLACK;
            case "red" -> ANSI_RED;
            case "green" -> ANSI_GREEN;
            case "yellow" -> ANSI_YELLOW;
            case "blue" -> ANSI_BLUE;
            case "magenta" -> ANSI_MAGENTA;
            case "cyan" -> ANSI_CYAN;
            case "white" -> ANSI_WHITE;
            default -> "";
        };
    }
    public static String getBackgroundColorCode(String color) {
        return switch (color.toLowerCase()) {
            case "black" -> ANSI_BG_BLACK;
            case "red" -> ANSI_BG_RED;
            case "green" -> ANSI_BG_GREEN;
            case "yellow" -> ANSI_BG_YELLOW;
            case "blue" -> ANSI_BG_BLUE;
            case "magenta" -> ANSI_BG_MAGENTA;
            case "cyan" -> ANSI_BG_CYAN;
            case "white" -> ANSI_BG_WHITE;
            default -> "";
        };
    }
}
