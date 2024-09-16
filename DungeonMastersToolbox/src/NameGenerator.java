import java.util.Scanner;
import java.util.Random;

public class NameGenerator {
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);

    public NameGenerator() {
        runMenu();
    }

    private void runMenu() {
        QOL.clearConsole();
        System.out.print(Art.logo);
        System.out.println(Art.nameGenMenu1);
        System.out.print(Art.placer);
        int userChoice = sc.nextInt();

        if (userChoice == 1) {
            chooseGender();
        }
    }

    private void chooseGender() {
        QOL.clearConsole();
        System.out.print(Art.logo);
        System.out.println(Art.nameGenMenu2);
        int userChoice = sc.nextInt();

        if (userChoice == 1) {
            generateNames("Male");
        } else if (userChoice == 2) {
            generateNames("Female");
        }
    }

    private void generateNames(String gender) {
        QOL.clearConsole();
        System.out.print(Art.logo);
        System.out.print(Art.amount);
        int amount = sc.nextInt();

        for (int i = 0; i < amount; i++) {
            // First and last name generation logic
            String randFname1, randFname2, randFname3, randFname4;

            if (gender.equals("Male")) {
                randFname1 = NameBank.veldraMaleP1Fir.get(rand.nextInt(NameBank.veldraMaleP1Fir.size()));
                randFname2 = NameBank.veldraMaleP2Fir.get(rand.nextInt(NameBank.veldraMaleP2Fir.size()));
            } else {
                randFname1 = NameBank.veldraFemaleP1Fir.get(rand.nextInt(NameBank.veldraFemaleP1Fir.size()));
                randFname2 = NameBank.veldraFemaleP2Fir.get(rand.nextInt(NameBank.veldraFemaleP2Fir.size()));
            }

            randFname3 = NameBank.veldraLast1.get(rand.nextInt(NameBank.veldraLast1.size()));
            randFname4 = NameBank.veldraLast2.get(rand.nextInt(NameBank.veldraLast2.size()));

            System.out.println((i + 1) + ". " + randFname1 + randFname2 + " " + randFname3 + randFname4);
        }

        System.out.println(Art.backToMenu);
        sc.nextLine();
        sc.nextLine();
    }
}
