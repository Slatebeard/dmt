import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;


public class DiceRoller {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    ArrayList<String> diceBank = new ArrayList<>(Arrays.asList());

    public DiceRoller() {
        runMenu();
    }

    private void runMenu() {
        boolean running = true;
        while (running) {
            QOL.clearConsole();
            System.out.print(Art.logo);
            System.out.println(Art.diceMenu);

            System.out.print(Art.placer);
            int diceAmount = sc.nextInt();

            System.out.println("d");
            System.out.print(Art.placer);
            int diceType = sc.nextInt();
            sc.nextLine();

            QOL.clearConsole();
            System.out.print(Art.logo);

            int total = 0;

            for (int i = 0; i < diceAmount; i++) {
                int result = 0;
                switch (diceType) {
                    case 2:
                        result = rand.nextInt(2) + 1;
                        if (result == 1)
                            diceBank.add(QOL.makeRed(result) + "");
                        else if (result == 6)
                            diceBank.add(QOL.makeGreen(result) + "");
                        else
                            diceBank.add(result + "");
                        break;
                    case 4:
                        result = rand.nextInt(4) + 1;
                        if (result == 1)
                            diceBank.add(QOL.makeRed(result) + "");
                        else if (result == 4)
                            diceBank.add(QOL.makeGreen(result) + "");
                        else
                            diceBank.add(result + "");
                        break;
                    case 6:
                        result = rand.nextInt(6) + 1;
                        if (result == 1)
                            diceBank.add(QOL.makeRed(result) + "");
                        else if (result == 6)
                            diceBank.add(QOL.makeGreen(result) + "");
                        else
                            diceBank.add(result + "");
                        break;
                    case 8:
                        result = rand.nextInt(8) + 1;
                        if (result == 1)
                            diceBank.add(QOL.makeRed(result) + "");
                        else if (result == 8)
                            diceBank.add(QOL.makeGreen(result) + "");
                        else
                            diceBank.add(result + "");
                        break;
                    case 10:
                        result = rand.nextInt(10) + 1;
                        if (result == 1)
                            diceBank.add(QOL.makeRed(result) + "");
                        else if (result == 10)
                            diceBank.add(QOL.makeGreen(result) + "");
                        else
                            diceBank.add(result + "");
                        break;
                    case 12:
                        result = rand.nextInt(12) + 1;
                        if (result == 1)
                            diceBank.add(QOL.makeRed(result) + "");
                        else if (result == 12)
                            diceBank.add(QOL.makeGreen(result) + "");
                        else
                            diceBank.add(result + "");
                        break;
                    case 20:
                        result = rand.nextInt(20) + 1;
                        if (result == 1)
                            diceBank.add(QOL.makeRed(result) + "");
                        else if (result == 20)
                            diceBank.add(QOL.makeGreen(result) + "");
                        else
                            diceBank.add(result + "");
                        break;
                    case 100:
                        result = rand.nextInt(100) + 1;
                        if (result == 1)
                            diceBank.add(QOL.makeRed(result) + "");
                        else if (result == 100)
                            diceBank.add(QOL.makeGreen(result) + "");
                        else
                            diceBank.add(result + "");
                        break;
                    default:
                        System.out.println("Invalid dice selection.");
                        return;
                }
                total += result;
            }

            System.out.println(diceBank);
            System.out.println("\nTotal: " + total);


            diceBank.clear();

            System.out.println("\nPress Enter to return to the main menu or press 1 to roll some more...");


            if (sc.nextLine().equals("1")) {
                running = true;
            } else
                running = false;


        }

    }

}
