import java.util.Random;
import java.util.Scanner;

public class NameGenerator2 {
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);

    String chosenLang = "";

    public void NameGenerator() {
        runMenu();
    }

    // Main menu where the user selects language, gender, and amount
    private void runMenu() {
        boolean running = true;

        while (running) {
            // Clear the console and show the menu
            QOL.clearConsole();
            System.out.print(Art.logo);
            System.out.println(Art.nameGenMenu1);
            System.out.print(Art.placer);

            // Get the language choice
            int userChoice = sc.nextInt();

            switch (userChoice) {
                case 1:
                    chosenLang = "Veldrasar";
                    break;
                case 2:
                    chosenLang = "Amaril";
                    break;
                default:
                    System.out.println("Invalid choice. Please select again.");
                    continue;
            }

            // Ask for gender
            QOL.clearConsole();
            System.out.print(Art.logo);
            System.out.println(Art.nameGenMenu2);  // Presuming this menu shows gender options
            int genderChoice = sc.nextInt();
            String gender = (genderChoice == 1) ? "Male" : "Female";

            // Ask for amount
            QOL.clearConsole();
            System.out.print(Art.logo);
            System.out.println(Art.amount);
            int amount = sc.nextInt();

            // Build and display the names based on selections
            nameBuilder(chosenLang, gender, amount);

            // After generating names, you could ask if the user wants to generate more or exit
            System.out.println("Generate more names? (y/n)");
            sc.nextLine();  // Consume newline
            String continueChoice = sc.nextLine();
            if (continueChoice.equalsIgnoreCase("n")) {
                running = false;
            }
        }
    }

    // Method to build names based on chosen language, gender, and amount
    private void nameBuilder(String language, String gender, int amount) {
        for (int i = 0; i < amount; i++) {
            String randFname1, randFname2, randLname1, randLname2;

            if (language.equals("Veldrasar")) {
                if (gender.equals("Male")) {
                    randFname1 = NameBank.veldraMaleP1Fir.get(rand.nextInt(NameBank.veldraMaleP1Fir.size()));
                    randFname2 = NameBank.veldraMaleP2Fir.get(rand.nextInt(NameBank.veldraMaleP2Fir.size()));
                } else {
                    randFname1 = NameBank.veldraFemaleP1Fir.get(rand.nextInt(NameBank.veldraFemaleP1Fir.size()));
                    randFname2 = NameBank.veldraFemaleP2Fir.get(rand.nextInt(NameBank.veldraFemaleP2Fir.size()));
                }
                randLname1 = NameBank.veldraLast1.get(rand.nextInt(NameBank.veldraLast1.size()));
                randLname2 = NameBank.veldraLast2.get(rand.nextInt(NameBank.veldraLast2.size()));
            } else if (language.equals("Amaril")) {
                if (gender.equals("Male")) {
                    randFname1 = NameBank.amarilMaleP1Fir.get(rand.nextInt(NameBank.amarilMaleP1Fir.size()));
                    randFname2 = NameBank.amarilMaleP2Fir.get(rand.nextInt(NameBank.amarilMaleP2Fir.size()));
                } else {
                    randFname1 = NameBank.amarilFemaleP1Fir.get(rand.nextInt(NameBank.amarilFemaleP1Fir.size()));
                    randFname2 = NameBank.amarilFemaleP2Fir.get(rand.nextInt(NameBank.amarilFemaleP2Fir.size()));
                }
                randLname1 = NameBank.amarilLast1.get(rand.nextInt(NameBank.amarilLast1.size()));
                randLname2 = NameBank.amarilLast2.get(rand.nextInt(NameBank.amarilLast2.size()));
            } else {
                System.out.println("Unknown language: " + language);
                return;
            }

            // Print the generated name
            System.out.println((i + 1) + ". " + randFname1 + randFname2 + " " + randLname1 + randLname2);
        }
    }
}
