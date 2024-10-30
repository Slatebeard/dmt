import slatebeard.util.Art;
import slatebeard.util.QOL;

import java.util.Random;
import java.util.Scanner;

public class NameGenerator {
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);
    String chosenLang = "";

    public NameGenerator() {
        runMenu();
    }

    private boolean running = true;

    private void runMenu() {

        boolean regenerate = false;


        while (running) {

            QOL.clearConsole();
            Art.logo();
            Art.nameGenMenu1();
            System.out.print(Art.placer);


            int userChoice = sc.nextInt();
            sc.nextLine();

            switch (userChoice) {
                case 1:
                    chosenLang = "Veldrasar";
                    break;
                case 2:
                    chosenLang = "Amaril";
                    break;
                case 4:
                    running = false;
                    regenerate = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please select again.");
                    break;
            }

            if (!running) {
                break;
            }

            runStatus();

            QOL.clearConsole();
            Art.logo();
            Art.nameGenMenu2();


            String gender = "";
            int genderChoice = sc.nextInt();

            if (genderChoice == 3) {
                running = false;
                regenerate = false;
            } else {
                gender = (genderChoice == 1) ? "Male" : "Female";
            }

            if (!running) {
                break;
            }


            QOL.clearConsole();
            System.out.print(Art.logo);
            System.out.println(Art.amount);
            int amount = sc.nextInt();
            System.out.print("\n");



            while (regenerate) {

                nameBuilder(chosenLang, gender, amount);

                System.out.println("\nWhat would you like to do next?");
                System.out.println("1. Re-generate names");
                System.out.println("2. Generate new names (change language, gender, or amount)");
                System.out.println("3. Exit");

                int nextAction = sc.nextInt();
                sc.nextLine();

                switch (nextAction) {
                    case 1:
                        regenerate = true;
                        QOL.clearConsole();
                        System.out.print(Art.logo);
                        break;
                    case 2:
                        regenerate = false;
                        QOL.clearConsole();
                        System.out.print(Art.logo);
                        break;
                    case 3:
                        regenerate = false;
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please select again.");
                        regenerate = true;
                }
            }
        }
    }

    private void runStatus() {
        if (!running) {
            running = false;
        }
    }


    private void nameBuilder(String language, String gender, int amount) {
        for (int i = 0; i < amount; i++) {
            String randFname1, randFname2, randLname1, randLname2;

               // Veldrasar
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

                // Amaril
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
            System.out.println((i + 1) + ". " + randFname1 + randFname2 + " " + randLname1 + randLname2);
        }
    }
}
