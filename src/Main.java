import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        // Objects
        Scanner sc = new Scanner(System.in);

        // Flags
        boolean running = true;


        while (running) {
            QOL.clearConsole();

            Art.logo();
            Art.startMenu();
            Art.placer();

            try {
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
                        new CreatureCreator();
                        break;
                    case 5:
                        HookGenerator hookGenerator = new HookGenerator("/home/slatebeard/java/dmt/data/hook.txt");
                        hookGenerator.runMenu();
                        break;
                    case 7:
                        QOL.clearConsole();
                        System.out.println("Journey Before Destination...");
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } catch (InputMismatchException e) {
                Art.backToMenu();
                sc.next();
            }
        }
    }
}