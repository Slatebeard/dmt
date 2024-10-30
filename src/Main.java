import slatebeard.util.Art;
import slatebeard.util.QOL;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;


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
                        randomWORqoute();
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

    private static void randomWORqoute() {
        Random random = new Random();

        String life = "Life Before Death...";
        String strenght = "Strenght Before Weakness...";
        String destination = "Journey Before Destination...";

        int dice = random.nextInt(0,4);

        if (dice == 1) {
            System.out.println(life);
        } else if (dice == 2) {
            System.out.println(strenght);
        } else if (dice == 3) {
            System.out.println(destination);
        }
    }
}