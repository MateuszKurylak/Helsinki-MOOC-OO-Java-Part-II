
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int roundCounter = 1;
        List<Participants> participantsList = new ArrayList<Participants>();

        System.out.println("Kumpula ski jumping week\n\nWrite the names of the participants one at a time; an empty string brings you to the jumping phase.");

        while (true) {
            System.out.print("  Participant name: ");
            String name = reader.nextLine();
            if (name.equals("")) {
                break;
            }
            participantsList.add(new Participants(name));
        }
        System.out.println("\nThe tournament begins!");

        while (true) {
            System.out.print("\nWrite \"jump\" to jump; otherwise you quit: ");
            String jumpOrQuit = reader.nextLine();
            if (!jumpOrQuit.equals("jump")) {
                break;
            } else {
                System.out.println("\nRound " + roundCounter + "\n\nJumping order:");
                Collections.sort(participantsList);
                for (int i = 0; i < participantsList.size(); i++) {
                    System.out.println("  " + (i + 1) + ". " + participantsList.get(i));
                }
                System.out.println("\nResults of round " + roundCounter);

                for (int i = 0; i < participantsList.size(); i++) {
                    participantsList.get(i).nextJump();
                    System.out.println(participantsList.get(i).roundRecords());
                }
                roundCounter++;
            }
        }
        System.out.println("\nThanks!\n\nTournament results:\nPosition    Name");
        Collections.sort(participantsList);
        Collections.reverse(participantsList);
        for (int i = 0; i < participantsList.size(); i++) {
            System.out.println((i + 1) + "           " + participantsList.get(i));
            System.out.println("            jump lengths: " + participantsList.get(i).getEveryJumpLength());
        }
    }
}
