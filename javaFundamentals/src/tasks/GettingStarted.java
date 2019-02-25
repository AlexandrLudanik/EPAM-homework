package tasks;
import java.time.ZonedDateTime;
import java.util.Random;

public class GettingStarted {

    /**
     * Implementation of Task 1 from Getting Started
     *
     * @param name String
     */
    public void helloUser(String name) {
        System.out.println("Hello " + name);
    }

    /**
     * Implementation of Task 2 from Getting Started
     *
     * @param args Array of String
     */
    public void showArgumentsFromConsoleInReverseOrder(String[] args) {
        System.out.println("Arguments from console in reverse order:");
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println(args[i]);
        }
    }

    /**
     * Implementation of Task 3 from Getting Started
     *
     * @param number of int
     */
    public void showRandomNumbersinOneLineAndNextLine(int number) {
        Random random = new Random();
        int[] randomValues = new int[number];
        for (int i = 0; i < number; i++) {
            randomValues[i] = random.nextInt();
        }
        System.out.println("The random numbers per line");
        for (int i : randomValues) {
            System.out.print(i + " ");
        }
        System.out.println("\nThe random numbers on a new line");
        for (int i : randomValues) {
            System.out.println(i);
        }
    }

    /**
     * Implementation of Task 4 from Getting Started
     *
     * @param password of String
     */
    public void checkPassword(String password) {
        String password2 = "test";
        if (password.equals(password2))
            System.out.println("Password is correct");
        else System.out.println("Password is incorrect");
    }

    /**
     * Implementation of Task 5 from Getting Started
     *
     * @param args Array of String
     */
    public void calculateSum(String[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }
        System.out.println("Sum numbers is: " + sum);
    }

    /**
     * Implementation of Task 6 from Getting Started
     *
     * @param name of String
     */
    public void nameAndDate(String name) {
        System.out.println(name + "\nDate start: 2019-02-04\nDate finish: " + ZonedDateTime.now());
    }


}
