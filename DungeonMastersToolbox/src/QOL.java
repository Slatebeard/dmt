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

}