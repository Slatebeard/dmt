package slatebeard.util;
import java.util.Scanner;

public class QIO {

    private Scanner in;

    public QIO() {
        in = new Scanner(System.in);
    }

    public int readInt() {
        while (true) {
            try {
                String nextLine = in.nextLine();
                int newtInt = Integer.parseInt(nextLine);
                return newtInt;
            } catch (NumberFormatException e) {
                System.out.println(QOL.makeTextRed("NOT AN INT..."));
            }
        }
    }

    public double readDouble() {
        while (true) {
            try {
                String nextDouble = in.nextLine();
                double newDouble = Double.parseDouble(nextDouble);
                return newDouble;
            } catch (NumberFormatException e) {
                System.out.println(QOL.makeTextRed("NOT AN DOUBLE..."));
            }
        }
    }

    public String readString() {
        return in.nextLine();
    }

    public static void print(Object data) {
        System.out.print(data);
    }

    public static void println(Object data) {
        System.out.println(data);
    }
}
