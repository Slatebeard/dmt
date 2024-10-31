import slatebeard.util.Art;
import slatebeard.util.QIO;
import slatebeard.util.QOL;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class NameGenerator {
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);
    QIO qio = new QIO();
    String chosenLang = "";

    public NameGenerator() {
        runMenu();
    }

    private boolean running = true;

    private final ArrayList<String> nameBank = new ArrayList<>();

    private void runMenu() {
        while (running) {

            QOL.clearConsole();
            Art.logo();
            Art.nameGenMenu1();
            Art.placer();


            int userChoice = sc.nextInt();

            sc.nextLine();

            switch (userChoice) {
                case 1:
                    chosenLang = "Veldrasar";
                    break;
                case 2:
                    chosenLang = "Amaril";
                    break;
                case 0:
                    running = false;
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

            if (genderChoice == 0) {
                running = false;
            } else {
                gender = (genderChoice == 1) ? "Male" : "Female";
            }

            if (!running) {
                break;
            }


            QOL.clearConsole();
            Art.logo();

            Art.spacer();
            QOL.setLine(3);
            Art.amount();
            QOL.setLine(3);
            Art.spacer();
            Art.placer();


            int amount = sc.nextInt();


            QOL.clearConsole();
            Art.logo();

            Art.spacer();
            QOL.setLine(1);

            QOL.setDraw(20);
            nameBuilder(chosenLang, gender, amount);

            QOL.setLine(2);
            Art.spacer();

            QOL.setLine(5);

            Art.backToMenu();

            String nextChoice = qio.readString();

            if (nextChoice.isEmpty()) {
                running = false;
            }
        }
    }

    private void runStatus() {
        if (!running) {
            running = false;
        }
    }


    private void nameBuilder(String language, String gender, int amount) {
        int row = 3;
        int counter = 0;

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

            String name = randFname1 + randFname2 + " " + randLname1 + randLname2;

            nameBank.add(name);

        }
        printNameInRows(nameBank,3);
    }

    private static void printNameInRows(ArrayList<String> nameBank, int columns) {
        int[] maxColumnWidths = new int[columns];

        for (int i = 0; i < nameBank.size(); i++) {
            int colIndex = i % columns;
            maxColumnWidths[colIndex] = Math.max(maxColumnWidths[colIndex], nameBank.get(i).length());
        }

        for (int i = 0; i < nameBank.size(); i++) {
            int colIndex = i % columns;
            String name = nameBank.get(i);

            System.out.print(name + " ".repeat(maxColumnWidths[colIndex] - name.length() + 2));

            if ((i + 1) % columns == 0) {
                QOL.setLine(1);
                QOL.setDraw(20);
            }
        }
    }
}
