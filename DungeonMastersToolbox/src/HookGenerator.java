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
        boolean running = true;
        int userChoice;
        while (running) {
            random = new Random();
            QOL.clearConsole();
            System.out.print(Art.logo);
            System.out.println(getRandomHook());
            System.out.println("\nPress Enter to return to the main menu or press 1 to get some more inspiration...");

            if (sc.nextLine().equals("1")) {
                running = true;
            } else
                running = false;

        }
    }
}
