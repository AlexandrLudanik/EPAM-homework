import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        int divident = 100000;
        int result = 1;


        try {
            readFile("D:\\rojects\\exceptions\\src\\file.txt");
        } catch (OutOfMemoryError outOfMemoryError) {
            outOfMemoryError.printStackTrace();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: file not found");
        }

        readFromConsole(divident, result);
    }


    private static void readFromConsole(int divident, int result) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String text = bufferedReader.readLine();
        bufferedReader.close();
        int[] newArray = parseStringToIntArray(text);
        for (int i = 0; i < newArray.length; i++) {
            try {
                result = divident / newArray[i];
            } catch (ArithmeticException ex) {
                System.out.println("ERROR: divide by zero");
            }
            System.out.println(result);
        }
    }


    public static int[] parseStringToIntArray(String str) {
        String[] strArray = str.split(" ");
        int[] intArray = new int[strArray.length];

        for (int j = 0; j < strArray.length; j++) {
            try {
                intArray[j] = Integer.parseInt(strArray[j]);
            } catch (NumberFormatException e) {
                System.out.println("ERROR: Seems like not a number was entered.. " +
                        "Will be forced to int to prevent program fail");
                char[] cArr = strArray[j].toCharArray();
                for (char c : cArr) {
                    intArray[j] = (int) c;
                }
            }
        }
        return intArray;
    }


    public static void readFile(String fileName) throws java.lang.OutOfMemoryError, IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String c;
        while ((c = reader.readLine()) != null) {
            System.out.println(c);
        }
    }
}

