import slatebeard.util.Art;
import slatebeard.util.QOL;

import java.net.SocketTimeoutException;
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

        String name;
        QOL.clearConsole();
        Art.logo();

        while (creating) {
            Art.spacer();
            QOL.setDraw(1);
            // NAME
            do {
                Art.setCreatureCreatorName();
                QOL.setDraw(47);
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

            // Type
            int i = 1;
            int counter = 0;

            for (Creature.type type : Creature.type.values()) {

                if (counter < 5) {
                    QOL.setDraw(35);
                    System.out.println(i + ". " + type);
                    i++;
                    counter++;
                } else {
                    QOL.setLine(1);
                    counter = 0;
                }
            }

            Art.spacer();
            QOL.setDraw(35);
            System.out.print("Choose a creature type: ");
            int typeChoice = sc.nextInt();

            if (typeChoice == 0) break;

            Creature.type creatureType = Creature.type.values()[typeChoice - 1];

            sumBuild(creatureType);

            QOL.menuRefresh();
            printSummary();

            // Alignment
            i = 1;
            Creature.alignment[] alignments = Creature.alignment.values();
            int mid = (alignments.length + 1) / 2;

            QOL.setDraw(30);
            for (int j = 0; j < mid; j++) {
                String leftColumn = i + ". " + alignments[j].toString();
                String rightColumn = (j + mid < alignments.length) ? (i + mid) + ". " + alignments[j + mid].toString() : "";
                System.out.printf("%-20s %s%n", leftColumn, rightColumn);
                i++;
                if (i < 6) {
                    QOL.setDraw(30);
                } else {
                    Art.spacer();
                }

            }

            QOL.setLine(1);
            QOL.setDraw(35);
            System.out.print("Choose an alignment: ");
            int alignmentChoice = sc.nextInt();

            if (alignmentChoice == 0) break;

            Creature.alignment creatureAlignment = Creature.alignment.values()[alignmentChoice - 1];

            sumBuild(creatureAlignment);
            QOL.menuRefresh();
            printSummary();

            // Size
            i = 1;
            Creature.size[] sizes = Creature.size.values();
            mid = (sizes.length) / 2;
            
            QOL.setDraw(33);
            for (int j = 0; j < mid; j++) {
                String leftColumn = i + ". " + sizes[j].toString();
                String rightColumn = (j + mid < sizes.length) ? (i + mid) + ". " + sizes[j + mid].toString() : "";
                System.out.printf("%-15s %s%n", leftColumn, rightColumn);
                if (j < 2 ) {
                    QOL.setDraw(33);
                    i++;
                } else {
                    Art.spacer();
                }
            }
            QOL.setLine(1);
            QOL.setDraw(33);
            System.out.print("Choose a size: ");
            int sizeChoice = sc.nextInt();

            if (sizeChoice == 0) break;

            Creature.size creatureSize = Creature.size.values()[sizeChoice - 1];

            sumBuild(creatureSize);
            QOL.menuRefresh();
            printSummary();
            QOL.setLine(1);

            // Category
            i = 1;
            Creature.creatureType[] types = Creature.creatureType.values();
            mid = (types.length) / 2;
        
            for (int j = 0; j < mid; j++) {
                String leftColumn = i + ". " + types[j].toString();
                String rightColumn = (j + mid < types.length) ? (i + mid) + ". " + types[j + mid].toString() : "";
                
                if (j < 5 ) {
                    QOL.setDraw(33);
                    System.out.printf("%-15s %s%n", leftColumn, rightColumn);
                    i++;
                }
            }
            
            Art.spacer(); 
            QOL.setLine(1);
            QOL.setDraw(33); 
            System.out.print("Choose a category: ");
            
            int categoryChoice = sc.nextInt();

            if (categoryChoice == 0) break;

            Creature.creatureType creatureCategory = Creature.creatureType.values()[categoryChoice - 1];

            sumBuild(creatureCategory);
            QOL.menuRefresh();
            printSummary();
            QOL.setLine(1);

            // Level
            QOL.setDraw(35);
            System.out.print("Enter the level of the creature: ");
            
            int level = sc.nextInt();

            if (level == 0) break;

            sumBuild(level);
            
            QOL.menuRefresh();
            
            printSummary();
            
            QOL.setLine(1);

            // Confirmation
            System.out.println(QOL.centerText("Is this information correct? (y/n)",96));
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
        QOL.setDraw(40);
        System.out.print("Current Summary:" + "\n");
        int counter = 0;
        for (String item : sumList) {
            if (counter < 6) {
                QOL.setDraw(33);
                System.out.print("- " + item + "\n");
                counter++;
            } else if (counter > 6){
                QOL.setLine(1);
                counter = 0;
            }
        }
        Art.spacer();
    }
}
