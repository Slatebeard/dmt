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

        boolean reGenerate = false;


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
                    reGenerate = true;
                    break;
                case 2:
                    chosenLang = "Amaril";
                    reGenerate = true;
                    break;
                case 0:
                    running = false;
                    reGenerate = false;
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
                reGenerate = false;
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
            QOL.centerText("0. Exit",96);



            while (reGenerate) {
                int nextAction = sc.nextInt();
                sc.nextLine();

                switch (nextAction) {
                    case 1:
                        reGenerate = true;
                        QOL.clearConsole();
                        Art.logo();
                        break;
                    case 2:
                        reGenerate = false;
                        QOL.clearConsole();
                        Art.logo();
                        break;
                    case 0:
                        reGenerate = false;
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please select again.");
                        reGenerate = true;
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

            if (counter < row) {
                System.out.print("| " + randFname1 + randFname2 + " " + randLname1 + randLname2 + " |" + " ");
                counter++;
            } else {
                System.out.println();
                QOL.setDraw(20);
                counter = 0;
            }
        }
    }
}
