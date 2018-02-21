
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        AiportPanel ui = new AiportPanel(reader);
        ui.start();
    }
}

class Plains {

    private String id;
    private int capacity;
    private ArrayList<String> destinations = new ArrayList<String>();

    public Plains(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    public void setDestination(String departure, String destination) {
        String oneWord = departure + "-" + destination;
        destinations.add(oneWord);
    }

    public String id() {
        return this.id;
    }

    public String printPlanes() {
        return this.id + " (" + this.capacity + " ppl)";
    }

    public String printFlights() {
        for (String dest : destinations) {
            System.out.println(this.id + " (" + this.capacity + " ppl) (" + dest + ")");
        }
        return "";
    }
}

class AiportPanel {

        Scanner reader;
        private ArrayList<Plains> planes;
        int counter = 0;

        public AiportPanel(Scanner reader) {
            this.reader = reader;
            planes = new ArrayList<Plains>();
        }

        public void start() {
            System.out.println("Airport panel\n" + "--------------------\n");

            while (counter == 0) {
                System.out.print("Choose operation:\n"
                        + "[1] Add airplane\n"
                        + "[2] Add flight\n"
                        + "[x] Exit\n"
                        + "> ");

                String readed = reader.nextLine();

                if (readed.equals("1")) {
                    System.out.print("Give plane ID: ");
                    String planeID = reader.nextLine();
                    System.out.print("Give plane capacity: ");
                    int planeCapacity = Integer.parseInt(reader.nextLine());
                    planes.add(new Plains(planeID, planeCapacity));
                }

                if (readed.equals("2")) {
                    System.out.print("Give plane ID: ");
                    String planeID = reader.nextLine();
                    System.out.print("Give departure airport code: ");
                    String departure = reader.nextLine();
                    System.out.print("Give destination airport code: ");
                    String destination = reader.nextLine();
                    for (Plains plain : planes) {
                        if (planeID.equals(plain.id())) {
                            plain.setDestination(departure, destination);
                        }
                    }
                }

                if (readed.equals("x")) {
                    System.out.println("\nFlight service\n" + "------------\n");
                    counter++;
                }
            }

            while (counter == 1) {
                System.out.print("Choose operation:\n"
                        + "[1] Print planes\n"
                        + "[2] Print flights\n"
                        + "[3] Print plane info\n"
                        + "[x] Quit\n"
                        + "> ");
                String second = reader.nextLine();

                if (second.equals("1")) {
                    for (Plains plain : planes) {
                        System.out.println(plain.printPlanes());
                    }
                }

                if (second.equals("2")) {
                    for (Plains plain : planes) {
                        System.out.println(plain.printFlights());
                    }
                }

                if (second.equals("3")) {
                    System.out.println("Give plane ID: ");
                    String id = reader.nextLine();
                    for (Plains plane : planes) {
                        if (id.equals(plane.id())) {
                            System.out.println(plane.printPlanes());
                        }
                    }
                }

                if (second.equals("x")) {
                    counter++;
                }
            }
        }
    }