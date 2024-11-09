package slatebeard.util;

public class QOL {

    private static final String RESET = "\033[0m";

    public static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //TODO Fix methods to Obejcts
    // COLORS
    //Ints
    public static String makeRed(int number) {
        String RED = "\033[0;31m";
        return RED + number + RESET;
    }

    public static String makeGreen(int number) {
        String GREEN = "\033[0;32m";
        return GREEN + number + RESET;
    }

    // Strings
    public static String makeTextRed(String text) {
        String RED = "\033[0;31m";
        return RED + text + RESET;
    }

    public static Object makeGreen(Object chars) {
        String GREEN = "\033[0;31m";
        return GREEN + chars + RESET;
    }

    public static String makeTextGreen(String text) {
        String GREEN = "\033[0;32m";
        return GREEN + text + RESET;
    }

    public static String makeBold(String text) {
        String BOLD = "\u001B[1m";
        return BOLD + text + RESET;
    }


    public static Object makeBackgroundBLACK(Object chars) {
        String BLACK_BACKGROUND = "\u001B[40m";
        return BLACK_BACKGROUND + chars + RESET;
    }

    public static Object makeBackgroundRED(Object chars) {
        String RED_BACKGROUND = "\u001B[41m";
        return RED_BACKGROUND + chars + RESET;
    }


    public static String debugStringLength(String text) {
        int amountChars = text.length();
        return amountChars + "";
    }

    public static void setLine(int amount) {
        String line = "";
        for (int i = 0; i < amount; i++) {
            System.out.println();
        }
    }

    public static String centerText(String text, int width) {
        String[] lines = text.split("\n");
        StringBuilder centeredText = new StringBuilder();

        for (String line : lines) {
            int padding = (width - line.length()) / 2;
            if (padding > 0) {
                centeredText.append(" ".repeat(padding)).append(line).append("\n");
            } else {
                centeredText.append(line).append("\n");
            }
        }
        return centeredText.toString();
    }

    public static void menuRefresh() {
        QOL.clearConsole();
        Art.logo();
    }

    public static void setDraw(int amount) {
        String line = " ";
        for (int i = 0; i < amount; i++) {
            System.out.print(line);
        }
    }

    public static void debug() {
        System.out.print("*DEBUG*");
    }
}
