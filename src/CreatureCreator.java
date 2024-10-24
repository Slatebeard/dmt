import java.util.Scanner;
import java.util.InputMismatchException;


public class CreatureCreator {
    private Scanner sc = new Scanner(System.in);

    public CreatureCreator() {
        runMenu();
    }

    private void runMenu() {


        // Flags
        boolean running = true;


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


        // Flags
        boolean creating = true;


        QOL.clearConsole();
        Art.logo();

        while (creating) {


            // Name
            do {
                System.out.print("Enter the name of the creature: " + Art.placer);
                name = sc.next();
            } while (name.length() < 1);

            QOL.menuRefresh();
            System.out.println("Name: " + QOL.makeTextGreen(name));
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
            Creature.type creatureType = Creature.type.values()[typeChoice - 1];


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
            Creature.allignment creatureAlignment = Creature.allignment.values()[alignmentChoice - 1];

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
            Creature.size creatureSize = Creature.size.values()[sizeChoice - 1];

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
            Creature.creatureType creatureCategory = Creature.creatureType.values()[categoryChoice - 1];


            // Level
            System.out.print("Enter the level of the creature: ");
            Art.placer();
            int level = sc.nextInt();

            QOL.menuRefresh();

            System.out.println("Name: " + QOL.makeTextGreen(name));
            System.out.println("Type: " + QOL.makeTextGreen(creatureType.toString()));
            System.out.println("Alignment: " + QOL.makeTextGreen(creatureAlignment.toString()));
            System.out.println("Size: " + QOL.makeTextGreen(creatureSize.toString()));
            System.out.println("Category: " + QOL.makeTextGreen(creatureCategory.toString()));
            System.out.println("Level: " + QOL.makeTextGreen(Integer.toString(level)));
            QOL.setLine(1);

            System.out.println("Is this information correct? (Y/N)");
            Art.placer();
            String correct = sc.next();
            if (correct.equalsIgnoreCase("y")) {
                new creature.Type.toString(name, creatureType, creatureAlignment, creatureSize, creatureCategory, level, 0, 0, 0);
                creating = false;
            }
        }
    }
}