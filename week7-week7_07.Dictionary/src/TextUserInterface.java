
import java.util.Scanner;

public class TextUserInterface {

    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        System.out.println("Statement:");
        System.out.println("  add - adds a word pair to the dictionary");
        System.out.println("  translate - asks a word and prints its translation");
        System.out.println("  quit - quits the text user interface");

        while (true) {
            System.out.println("");
            System.out.print("Statement: ");
            String readed = reader.nextLine();

            if (readed.equals("quit")) {
                System.out.println("Cheers!");
                break;
            }
            if (readed.equals("add")) {
                add();
            }
            if (readed.equals("translate")) {
                translate();
            } else {
                System.out.println("Unknown statement");
            }
        }
    }

    public void add() {
        System.out.print("In Finnish: ");
        String finnish = reader.nextLine();
        System.out.print("Translation: ");
        String translation = reader.nextLine();
        this.dictionary.add(finnish, translation);
    }

    public void translate() {
        System.out.print("Give a word: ");
        System.out.println("Translation: " + this.dictionary.translate(reader.nextLine()));
    }
}
