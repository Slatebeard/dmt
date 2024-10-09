import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;



        while (running) {
            QOL.clearConsole();
            System.out.print(Art.logo);
            System.out.println(Art.startMenu);
            System.out.print(Art.placer);

            int userChoice = sc.nextInt();

            switch (userChoice) {
                case 1:
                    new NameGenerator();
                    break;
                case 2:
                    break;
                case 3:
                    new DiceRoller();
                    break;
                case 4:
//                    new monsterCreator();
                case 5:
                    HookGenerator hookGenerator = new HookGenerator("/home/slatebeard/java/dmt/DungeonMastersToolbox/data/hook.txt");
                    hookGenerator.runMenu();
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;


            }
        }
    }
}