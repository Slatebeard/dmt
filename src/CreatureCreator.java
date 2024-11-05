import slatebeard.util.Art;
import slatebeard.util.QOL;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class CreatureCreator {
    private final Scanner sc = new Scanner(System.in);
    private final ArrayList<String> sumList = new ArrayList<>();
    private boolean running = true;
    private boolean creating = true;

    public CreatureCreator() {
        runMenu();
    }

    private void runMenu() {


        // Logic
        while (running) {
            QOL.clearConsole();
            Art.logo();
            Art.creatureCreatorMenu();
            Art.placer();
            try {
                int userChoice = sc.nextInt();
                switch (userChoice) {
                    case 1:
                        createCreature();
                        break;
                    case 2:
                        break;
                    case 3:
                    case 4:
                    case 0:
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

    private void createCreature() {
        // Variables
        String name = "";

        QOL.clearConsole();
        Art.logo();

        // Logic
        while (creating) {

            // NAME
            do {
                Art.setCreatureCreatorName();
                Art.placer();
                name = sc.next();

                if (name.equals("0")) {
                    creating = false;
                    running = false;
                    break;
                }
            } while (name.length() <= 1);

            if (!creating) break;


            sumBuild(name);
            QOL.menuRefresh();
            printSummary();
            QOL.setLine(1);

            // Type
            int i = 1;

            for (Creature.type type : Creature.type.values()) {
                System.out.println(i + ". " + type);
                i++;
            }
            QOL.setLine(1);
            System.out.println("Choose a creature type: ");
            Art.placer();
            int typeChoice = sc.nextInt();

            if (typeChoice == 0) break;

            Creature.type creatureType = Creature.type.values()[typeChoice - 1];

            sumBuild(creatureType);
            QOL.menuRefresh();
            printSummary();
            QOL.setLine(1);


            // Alignment
            i = 1;
            for (Creature.allignment alignment : Creature.allignment.values()) {
                System.out.println(i + ". " + alignment);
                i++;
            }
            QOL.setLine(1);
            System.out.println("Choose an alignment: ");
            Art.placer();
            int alignmentChoice = sc.nextInt();

            if (alignmentChoice == 0) break;

            Creature.allignment creatureAlignment = Creature.allignment.values()[alignmentChoice - 1];

            sumBuild(creatureAlignment);
            QOL.menuRefresh();
            printSummary();
            QOL.setLine(1);

            // Size
            i = 1;
            for (Creature.size size : Creature.size.values()) {
                System.out.println(i + ". " + size);
                i++;
            }
            QOL.setLine(1);
            System.out.println("Choose a size: ");
            Art.placer();
            int sizeChoice = sc.nextInt();

            if (sizeChoice == 0) break;

            Creature.size creatureSize = Creature.size.values()[sizeChoice - 1];

            sumBuild(creatureSize);
            QOL.menuRefresh();
            printSummary();
            QOL.setLine(1);

            // Category
            i = 1;
            for (Creature.creatureType category : Creature.creatureType.values()) {
                System.out.println(i + ". " + category);
                i++;
            }
            QOL.setLine(1);
            System.out.println("Choose a category: ");
            Art.placer();
            int categoryChoice = sc.nextInt();

            if (categoryChoice == 0) break;

            Creature.creatureType creatureCategory = Creature.creatureType.values()[categoryChoice - 1];

            sumBuild(creatureCategory);
            QOL.menuRefresh();
            printSummary();
            QOL.setLine(1);

            // Level
            System.out.print("Enter the level of the creature: ");
            Art.placer();
            int level = sc.nextInt();

            if (level == 0) break;

            sumBuild(level);
            QOL.menuRefresh();
            printSummary();
            QOL.setLine(1);

            // Confirmation
            System.out.println("Is this information correct? (Y/N)");
            Art.placer();
            String correct = sc.next();
            if (correct.equalsIgnoreCase("y")) {
                creating = false;
            }
        }


        System.out.println("Final Creature Summary:");
        for (String entry : sumList) {
            System.out.println("- " + entry);
        }
    }


    private void sumBuild(String entry) {
        sumList.add(entry);
    }

    private void sumBuild(Enum<?> entry) {
        sumList.add(entry.toString());
    }

    private void sumBuild(int entry) {
        sumList.add(String.valueOf(entry));
    }


    private void printSummary() {
        Art.spacer();
        QOL.setDraw(31);
        System.out.print("Current Summary:" + "\n");
        for (String item : sumList) {
            QOL.setDraw(33);
            System.out.print("- " + item + "\n");

        }
    }
}
