package slatebeard.util;
public class QOL {

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

    // COLORS
        //Ints
    public static String makeRed (int number) {
        String RED = "\033[0;31m";
        String RESET = "\033[0m";
        return RED + number + RESET;
    }

    public static String makeGreen (int number) {
        String GREEN = "\033[0;32m";
        String RESET = "\033[0m";
        return GREEN + number + RESET;
    }
        // Strings
    public static String makeTextRed (String text) {
        String RED = "\033[0;31m";
        String RESET = "\033[0m";

        return RED + text + RESET;
    }

    public static String makeTextGreen (String text) {
        String GREEN = "\033[0;32m";
        String RESET = "\033[0m";
        return GREEN + text + RESET;
    }

    public static String makeBold(String text) {
        String BOLD = "\u001B[1m";
        String RESET = "\033[0m";
        return BOLD + text + RESET;
    }



    public static String debugStringLength(String text) {
        int amountChars = text.length();
        String fastStringConvert = amountChars + "";
        return fastStringConvert;
    }






    public static String setLine (int amount) {
        String line = "";
        for (int i = 0; i < amount; i++) {
            System.out.println();
        }
        return line;
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
        String output = centeredText.toString();
        return output;
    }

    public static void menuRefresh() {
        QOL.clearConsole();
        Art.logo();
    }

    public static String setDraw(int amount) {
        String line = " ";
        for (int i = 0; i < amount; i++) {
            System.out.print(line);
        }
        return line;
    }
}