import slatebeard.util.Art;
import slatebeard.util.QOL;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class HookGenerator {
    private List<String> hooks;
    private Random random;
    private Scanner sc;  

    public HookGenerator(String filePath) {
        hooks = new ArrayList<>();
        sc = new Scanner(System.in);  
        loadHooksFromFile(filePath);
    }

    private void loadHooksFromFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    hooks.add(line.trim());
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading hooks file: " + e.getMessage());
        }
    }

    public String getRandomHook() {
        if (hooks.isEmpty()) {
            return "No hooks available.";
        }
        int randomIndex = random.nextInt(hooks.size());
        return hooks.get(randomIndex);
    }

    public void printRandomHook() {
        System.out.println(getRandomHook());
    }

    public void runMenu() {


        // Variables
        boolean running = true;
        int userChoice;

        // Logic
        while (running) {
            random = new Random();
            QOL.clearConsole();
            Art.logo();
            QOL.setLine(1);
            System.out.println("Enter how many hooks you would like to generate or enter 0 to return to the main menu.");
            Art.placer();

            try {
                userChoice = sc.nextInt();
                sc.nextLine();
                QOL.setLine(1);

                if (userChoice == 0) {
                    running = false;
                    break;
                }



                int j = 0;

                for (int i = 0; i < userChoice; i++) {

                    if (j % 2 == 0) {
                        System.out.println(QOL.makeTextGreen(getRandomHook()));
                        j++;
                    } else if (j == 1) {
                        System.out.println(QOL.makeTextRed(getRandomHook()));
                        j = 0;
                    }
                    QOL.setLine(1);
                }
                System.out.print("\nPress Enter to return to the main menu or press 1 to get some more inspiration...");
                if (sc.nextLine().equals("1")) {
                    running = true;
                } else
                    running = false;
            } catch (Exception e) {
                System.out.println("Invalid choice. Please try again.");
                sc.next();
            }
        }
    }
}
