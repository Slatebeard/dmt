
public class Art {

    public static String logo = """
                  ___                                                       _            _      _____            _ _              \s
                 /   \\_   _ _ __   __ _  ___  ___  _ __     /\\/\\   __ _ ___| |_ ___ _ __( )__  /__   \\___   ___ | | |__   _____  __
                / /\\ / | | | '_ \\ / _` |/ _ \\/ _ \\| '_ \\   /    \\ / _` / __| __/ _ \\ '__|/ __|   / /\\/ _ \\ / _ \\| | '_ \\ / _ \\ \\/ /
               / /_//| |_| | | | | (_| |  __/ (_) | | | | / /\\/\\ \\ (_| \\__ \\ ||  __/ |   \\__ \\  / / | (_) | (_) | | |_) | (_) >  <\s
              /___,'  \\__,_|_| |_|\\__, |\\___|\\___/|_| |_| \\/    \\/\\__,_|___/\\__\\___|_|   |___/  \\/   \\___/ \\___/|_|_.__/ \\___/_/\\_\\
            \s
            """;

    public static String startMenu = """
                                                          +~-~-~-~-~-~-~-~<*>~-~-~-~-~-~-~-~+
                                                          |      1.Name Generator           |
                                                          !      2.Weather Generator        !
                                                          |      3.Dice Roller              |
                                                          !      4.Creature Creator         !
                                                          |      5.Touch Of Inspiration     |
                                                          !      6.**UNDER CONSTRUCTION**   !
                                                          |      7.Exit                     |
                                                          +~-~-~-~-~-~-~-~<*>~-~-~-~-~-~-~-~+
            """;
    public static String nameGenMenu1 = """
                                                                     Choose A Language.
                                                           +~-~-~-~-~-~-~-~<*>~-~-~-~-~-~-~-~+
                                                           |      1.Veldrasi                 |
                                                           !      2.Amaril                   !
                                                           |      3.Drudain                  |
                                                           !      4.Return                   |
                                                           +~-~-~-~-~-~-~-~<*>~-~-~-~-~-~-~-~+
            """;
    public static String nameGenMenu2 = """
                                                                     Choose A Gender.
                                                           +~-~-~-~-~-~-~-~<*>~-~-~-~-~-~-~-~+
                                                           |      1.Male                     |
                                                           !      2.Female                   !
                                                           |                                 |
                                                           !      3.Return                   !
                                                           +~-~-~-~-~-~-~-~<*>~-~-~-~-~-~-~-~+
            """;
    public static String amount = """
                                                               Choose amount.
            """;
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

    public static String creatureCreatorMenu = """
                                                        +~-~-~-~-~-~-~-~<*>~-~-~-~-~-~-~-+
                                                        |      1.Create Creature         |
                                                        !      2.Return                  !
                                                        +~-~-~-~-~-~-~-~<*>~-~-~-~-~-~-~-+
            """;






    public static String placer = ">";
    public static String spacer = "                                                   ";
    private static String backToMenu = "Press Enter to return to the main menu...";
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




    // Methods
    public static void backToMenu() {
        System.out.print(backToMenu);
    }
    public static void logo() {
        System.out.print(logo);
    }
    public static void startMenu() {
        System.out.print(startMenu);
    }
    public static void nameGenMenu1() {
        System.out.print(nameGenMenu1);
    }
    public static void nameGenMenu2() {
        System.out.print(nameGenMenu2);
    }
    public static void amount() {
        System.out.print(amount);
    }
    public static void diceMenu() {
        System.out.print(diceMenu);
    }
    public static void placer() {
        System.out.print(placer);
    }
    public static void spacer() {
        System.out.print(spacer);
    }
    public static void map() {
        System.out.print(map);
    }
    public static void creatureCreatorMenu() {
        System.out.print(creatureCreatorMenu);
    }
}
