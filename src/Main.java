import java.util.InputMismatchException;
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
    //                    new creatureCreator();
                    case 5:
                        HookGenerator hookGenerator = new HookGenerator("/home/slatebeard/java/dmt/DungeonMastersToolbox/data/hook.txt");
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