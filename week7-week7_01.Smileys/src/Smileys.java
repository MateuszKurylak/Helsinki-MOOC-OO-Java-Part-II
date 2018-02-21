
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        // printWithSmileys("Method");
        printWithSmileys("Kamil");
        printWithSmileys("Mateusz");
    }

    private static void printWithSmileys(String characterString) {
        int length = characterString.length();

        int numberOfSmiles = (length + 6) / 2;
        smileys(numberOfSmiles, ifOdd(length));
        middlePart(ifOdd(length), characterString);
        smileys(numberOfSmiles, ifOdd(length));
    }

    private static void smileys(int numberOfSmileys, boolean ifOdd) {
        if (ifOdd) {
            for (int i = 0; i < numberOfSmileys + 1; i++) {
                System.out.print(":)");
            }
        } else {
            for (int i = 0; i < numberOfSmileys; i++) {
                System.out.print(":)");
            }
        }
        System.out.println("");
    }

    private static boolean ifOdd(int number) {
        if (number % 2 == 1) {
            return true;
        }
        return false;
    }

    private static void middlePart(boolean oddNumber, String characterString) {
        if (oddNumber) {
            System.out.print(":) " + characterString + "  :)");
        } else {
            System.out.print(":) " + characterString + " :)");
        }
        System.out.println("");
    }
}
