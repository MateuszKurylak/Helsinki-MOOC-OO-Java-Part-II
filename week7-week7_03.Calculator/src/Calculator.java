
public class Calculator {

    private Reader reader = new Reader();
    private int statistics = 0;

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }
        statistics();
    }

    private void sum() {
        int[] helper = TwoValuesMethod();
        System.out.println("sum of the values " + (helper[0] + helper[1]));
    }

    private void difference() {
        int[] helper = TwoValuesMethod();
        System.out.println("difference of the values " + (helper[0] - helper[1]));
    }

    private void product() {
        int[] helper = TwoValuesMethod();
        System.out.println("product of the values " + (helper[0] * helper[1]));
    }

    private int[] TwoValuesMethod() {
        int[] myList = new int[2];
        statistics++;

        System.out.print("value1: ");
        myList[0] = reader.readInteger();
        System.out.print("value2: ");
        myList[1] = reader.readInteger();

        return myList;
    }

    private void statistics() {
        System.out.println("Calculations done " + statistics);
    }
}
