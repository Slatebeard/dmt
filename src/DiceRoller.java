import slatebeard.util.Art;
import slatebeard.util.QOL;

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
            Art.logo();
            Art.diceMenu();

            System.out.print(Art.placer);
            int diceAmount = sc.nextInt();

            System.out.println("d");
            Art.placer();
            int diceType = sc.nextInt();
            sc.nextLine();

            QOL.clearConsole();
            Art.logo();

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

//            for (int i = 0; i < diceBank.size(); i++) {
//                int value = Integer.parseInt(diceBank.get(i));
//
//                if (value == 1) {
//
//                    diceBank.set(i, QOL.makeRed(Integer.parseInt(diceBank.get(i))));
//                } else if (value == diceValue) {
//
//                    diceBank.set(i, QOL.makeGreen(Integer.parseInt(diceBank.get(i))));
//                }
//            }


            Art.spacer();
            QOL.setLine(1);

            QOL.setDraw(32);
            diceBankOut(diceType);
            QOL.setLine(2);

            QOL.setDraw(31);
            System.out.println("Total: " + total);
            QOL.setDraw(31);
            System.out.println("Average: " + (total / diceAmount));
            QOL.setDraw(31);
            QOL.setLine(1);
            QOL.setDraw(31);
            System.out.println("As Above: " + aboveAverage.length);
            QOL.setDraw(31);
            System.out.println("So Below: " + belowAverage.length);
            QOL.setLine(1);
            QOL.setDraw(31);
            System.out.println("Amount of dice at average " + diceType + ": " + (aboveCount - belowCount));

            QOL.setLine(1);

            Art.spacer();

            QOL.setLine(1);

            diceBank.clear();

            System.out.print("\nPress Enter to return to the main menu or press 1 to roll some more...");


            if (sc.nextLine().equals("1")) {
                running = true;
            } else
                running = false;


        }
    }

    public void diceBankOut(int diceType) {
        int out = 0;

        for (int i = 0; i < diceBank.size(); i++) {
            String pady;
            String formatDBindex = diceBank.get(i);

            if (Integer.parseInt(diceBank.get(i)) == diceType) {
                if (diceBank.get(i).length() > 2) {
                    pady = "";
                    formatDBindex = QOL.makeTextGreen(diceBank.get(i));
                } else if (diceBank.get(i).length() > 1) {
                    pady = " ";
                    formatDBindex = QOL.makeTextGreen(diceBank.get(i));
                } else {
                    pady = "  ";
                    formatDBindex = QOL.makeTextGreen(diceBank.get(i));
                }

            } else if (diceBank.get(i).length() == 2) {
                pady = " ";
            } else if (diceBank.get(i).equals("1")) {
                pady = "  ";
                formatDBindex = QOL.makeTextRed(diceBank.get(i));
            } else {
                pady = "  ";
            }

            System.out.print("| " + pady + formatDBindex + " ");
            out++;

            if (out == 5) {
                System.out.print("|");
                System.out.println();
                QOL.setDraw(32);
                out = 0;
            }
        }
    }
}
