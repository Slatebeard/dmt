import java.io.StringBufferInputStream;
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
        double diceValue = 0;

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
                        diceValue = 2.0;
                        result = rand.nextInt(2) + 1;
                        diceBank.add(result + "");
                        break;
                    case 4:
                        diceValue = 4.0;
                        result = rand.nextInt(4) + 1;
                        diceBank.add(result + "");
                        break;
                    case 6:
                        diceValue = 6.0;
                        result = rand.nextInt(6) + 1;
                        diceBank.add(result + "");
                        break;
                    case 8:
                        diceValue = 8.0;
                        result = rand.nextInt(8) + 1;
                        diceBank.add(result + "");
                        break;
                    case 10:
                        diceValue = 10.0;
                        result = rand.nextInt(10) + 1;
                        diceBank.add(result + "");
                        break;
                    case 12:
                        diceValue = 12.0;
                        result = rand.nextInt(12) + 1;
                        diceBank.add(result + "");
                        break;
                    case 20:
                        diceValue = 20.0;
                        result = rand.nextInt(20) + 1;
                        diceBank.add(result + "");
                        break;
                    case 100:
                        diceValue = 100.0;
                        result = rand.nextInt(100) + 1;
                        diceBank.add(result + "");
                        break;
                    default:
                        System.out.println("Invalid dice selection.");
                        return;
                }
                total += result;
            }


            String[] aboveAverage = new String[diceAmount];
            String[] belowAverage = new String[diceAmount];

            int aboveCount = 0;
            int belowCount = 0;

            // Average % Calculator
            for (int i = 0; i < diceBank.size(); i++) {
                double value = Double.parseDouble(diceBank.get(i));

                if (value > (diceValue / 2)) {
                    aboveAverage[aboveCount++] = String.valueOf(value);
                } else if (value < (diceValue / 2)) {
                    belowAverage[belowCount++] = String.valueOf(value);
                }
            }

            aboveAverage = Arrays.copyOf(aboveAverage, aboveCount);
            belowAverage = Arrays.copyOf(belowAverage, belowCount);

            System.out.println(diceBank);
            System.out.println("\nTotal: " + total);
            System.out.println("Average: " + (total / diceAmount));
            System.out.println("As Above: " + aboveAverage.length);
            System.out.println("So Below: " + belowAverage.length);

            diceBank.clear();

            System.out.println("\nPress Enter to return to the main menu or press 1 to roll some more...");


            if (sc.nextLine().equals("1")) {
                running = true;
            } else
                running = false;


        }

    }

}
