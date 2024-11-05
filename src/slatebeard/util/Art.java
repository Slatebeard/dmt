package slatebeard.util;

public class Art {

    private static final String logo = """
                  ___                                                       _            _      _____            _ _              \s
                 /   \\_   _ _ __   __ _  ___  ___  _ __     /\\/\\   __ _ ___| |_ ___ _ __( )__  /__   \\___   ___ | | |__   _____  __
                / /\\ / | | | '_ \\ / _` |/ _ \\/ _ \\| '_ \\   /    \\ / _` / __| __/ _ \\ '__|/ __|   / /\\/ _ \\ / _ \\| | '_ \\ / _ \\ \\/ /
               / /_//| |_| | | | | (_| |  __/ (_) | | | | / /\\/\\ \\ (_| \\__ \\ ||  __/ |   \\__ \\  / / | (_) | (_) | | |_) | (_) >  <\s
              /___,'  \\__,_|_| |_|\\__, |\\___|\\___/|_| |_| \\/    \\/\\__,_|___/\\__\\___|_|   |___/  \\/   \\___/ \\___/|_|_.__/ \\___/_/\\_\\
            \s
            """;

    private static final String logo3 = "dmt";

    private static final String startMenu = "+~-~-~-~-~-~-~-~<*>~-~-~-~-~-~-~-~+\n" +
            "|      1.Name Generator           |\n" +
            "!      2.Weather Generator        !\n" +
            "|      3.Dice Roller              |\n" +
            "!      4.Creature Creator         !\n" +
            "|      5.Touch Of Inspiration     |\n" +
            "!      6.**UNDER CONSTRUCTION**   !\n" +
            "|      0.Exit                     |\n" +
            "+~-~-~-~-~-~-~-~<*>~-~-~-~-~-~-~-~+";

    private static final String nameGenMenu1 = "  Choose A Language.\n" +
            "+~-~-~-~-~-~-~-~<*>~-~-~-~-~-~-~-~+\n" +
            "|      1.Veldrasi                 |\n" +
            "!      2.Amaril                   !\n" +
            "|      3.Drudain                  |\n" +
            "!                                 !\n" +
            "|                                 |\n" +
            "!      0.Return                   !\n" +
            "+~-~-~-~-~-~-~-~<*>~-~-~-~-~-~-~-~+";

    private static final String nameGenMenu2 = "  Choose A Gender.\n" +
            "+~-~-~-~-~-~-~-~<*>~-~-~-~-~-~-~-~+\n" +
            "|      1.Male                     |\n" +
            "!      2.Female                   !\n" +
            "|                                 |\n" +
            "!                                 !\n" +
            "|                                 |\n" +
            "!      0.Return                   !\n" +
            "+~-~-~-~-~-~-~-~<*>~-~-~-~-~-~-~-~+";

    private static final String amount = "Choose amount.";


    public static String diceMenu = """
                                                        Enter Amount <ENTER> Enter Dice Type
                                           +~-~-~-~-~-~-~-~-~-~-~-~-~-~<*>~-~-~-~-~-~-~-~-~-~-~-~-~-~-~+
                                           |             d2                            d10             |
                                           !                                                           !
                                           |             d4                            d12             |
                                           !                                                           !
                                           |             d6                            d20             |
                                           !                                                           !
                                           |             d8                            d100            |
                                           +~-~-~-~-~-~-~-~-~-~-~-~-~-~<*>~-~-~-~-~-~-~-~-~-~-~-~-~-~-~+
            """;

    private static final String diceMenu2 = "Enter Amount <ENTER> Enter Dice Type\n" +
            "+~-~-~-~-~-~-~-~<*>~-~-~-~-~-~-~-~+\n" +
            "|      d2                d10      |\n" +
            "!                                 !\n" +
            "|      d4                d12      |\n" +
            "!                                 !\n" +
            "|      d6                d20      |\n" +
            "!                                 !\n" +
            "|      d8                d100     |\n" +
            "+~-~-~-~-~-~-~-~<*>~-~-~-~-~-~-~-~+";

    private static final String spacer = "+~-~-~-~-~-~-~-~<*>~-~-~-~-~-~-~-~+";
    private static final String bigSpacer = "+-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~<*>~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-+";

    private static final String diceBoxCover = "__________________________";

    private static final String creatureCreatorMenu2 = "+~-~-~-~-~-~-~-~<*>~-~-~-~-~-~-~-~+\n" +
            "|      1.Create Creature          |\n" +
            "!      2.List Creatures           !\n" +
            "|      3.Remove Creatures         |\n" +
            "!                                 !\n" +
            "|      0.Return                   |\n" +
            "+~-~-~-~-~-~-~-~<*>~-~-~-~-~-~-~-~+";
    private static final String creatureCreatorName = "Enter the name of the creature: ";
    private static final String placer = ">";
    private static final String backToMenu = "Press ENTER to return to the main menu...";
    public static String map = """ 
            +~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-+
            |                                                                                                                                        |
            !                                                                                                                                          !
            |                                                                                                                                          |
            !                                                                                                                                          !
            |                                                                                                                                          |
            !                                                                                                                                          !
            |                                                                                                                                          |
            !                                                                                                                                          !
            |                                                                                                                                          |
            !                                                                                                                                          !
            |                                                                                                                                          |
            !                                                                                                                                          !
            |                                                                                                                                          |
            !                                                                                                                                          !
            |                                                                                                                                          |
            !                                                                                                                                          !
            |                                                                                                                                          |
            +~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-+
            """;



    // TERMINAL SIZE





    // Methods
    public static void backToMenu() {
        System.out.print(QOL.centerText(backToMenu,96));
    }

    public static void logo() {
        QOL.setDraw(46);
        System.out.println(QOL.makeBackgroundBLACK(QOL.makeBold(logo3)));
    }

    public static void mainMenu() {
        System.out.println((QOL.centerText(startMenu, 96)));

    }

    public static void nameGenMenu1() {
        System.out.print(QOL.centerText(nameGenMenu1,96));
    }

    public static void nameGenMenu2() {
        System.out.print(QOL.centerText(nameGenMenu2,96));
    }

    public static void amount() {
        System.out.print(QOL.centerText(amount,96));
    }

    public static void diceMenu() {
        String text = QOL.centerText(diceMenu2, 96);
        System.out.print(text);
    }

    public static void placer() {
        System.out.print(placer);
    }

    public static void spacer() {
        String text = QOL.centerText(spacer, 96);
        System.out.print(text);
    }

    public static void bigSpacer() {
        String text = QOL.centerText(bigSpacer,96);
        System.out.print(text);
    }

    public static void map() {
        System.out.print(map);
    }

    public static void creatureCreatorMenu() {
        System.out.println(QOL.centerText(creatureCreatorMenu2, 96));
    }

    public static void setCreatureCreatorName() {
        System.out.print(QOL.centerText(creatureCreatorName,96));
    }

}
