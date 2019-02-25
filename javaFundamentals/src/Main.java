import tasks.DataTypes;
import tasks.GettingStarted;
import tasks.Operators;
import tasks.ArraysTask;
import utils.Matrix;
import utils.Utils;

import java.io.IOException;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) throws IOException {

        System.out.println("Please, enter your name and press Enter button");
        // read name from console
        String name = Utils.typeUserName();
        System.out.println("Please, enter int number and press Enter button");
        // read number from console
        int number = Utils.amountOfNumbers();
        System.out.println("Please, enter password and press Enter button");
        String password = Utils.typeUserName();
        // read line from console
        System.out.println("Please, enter some int numbers and press Enter button");
        String rString = Utils.readLine();
        // try parse string to integer array and return it
        int intArray[] = Utils.parseStringToIntArray(rString);
        // instance of Group A


        /**
         * Getting Started
         */
        GettingStarted gettingStarted = new GettingStarted();

        /**
         * 1. Приветствовать любого пользователя при вводе его имени через командную строку.
         */
        gettingStarted.helloUser(name);

        /**
         * 2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
         */
        gettingStarted.showArgumentsFromConsoleInReverseOrder(args);

        /**
         * 3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
         */
        gettingStarted.showRandomNumbersinOneLineAndNextLine(number);

        /**
         * 4. Ввести пароль из командной строки и сравнить его со строкой-образцом.
         */
        gettingStarted.checkPassword(password);
        /**
         * 5. Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести результат на консоль.
         */
        gettingStarted.calculateSum(args);
        /**
         * 6. Вывести фамилию разработчика, дату и время получения задания, а также дату и время сдачи задания
         */
        gettingStarted.nameAndDate(name);

        /**
         * Data Types
         */

        DataTypes dataTypes = new DataTypes();
        /**
         * 1. Найти самое короткое и самое длинное число. Вывести найденные числа и
         их длину
         */
        dataTypes.findLongestAndShortestElement(intArray);
        /**
         * 2. Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.
         */
        dataTypes.showNumbersInOrderLength(intArray);

        /**
         * 3. Вывести на консоль те числа, длина которых меньше (больше) средней, а
         также длину.
         */
        dataTypes.showNumbersLessThanAverage(intArray);
        /**
         * 4. Найти число, состоящее только из различных цифр. Если таких чисел не-
         сколько, найти первое из них.
         */
        dataTypes.showFirstDifferentNumber(intArray);
        /**
         * 5. Среди чисел найти число-палиндром. Если таких чисел больше одного,
         найти второе.
         */
        dataTypes.showPalindrome(intArray);
        /**
         * Operators
         */
        Operators operators = new Operators();
        /**
         * 1. Определить принадлежность некоторого значения k интервалу [n, m].
         */
        int[] interval = {-1, 4};
        int valueToCheck = 3;
        boolean isBelongs = operators.isBelongsToInterval(valueToCheck, interval);
        if (isBelongs) {
            System.out.println("Value " + valueToCheck +
                    " belongs to interval " + Arrays.toString(interval));
        } else {
            System.out.println("Value " + valueToCheck +
                    " doesn't belong to interval " + Arrays.toString(interval));
        }


        /**
         * 2. Ввести число от 1 до 12. Вывести на консоль название месяца,
         соответствующего данному числу. Осуществить проверку корректности
         ввода чисел.
         */
        operators.printMonth(12);

        /**
         * TASK OF Arrays
         */

        ArraysTask arraysTask = new ArraysTask();
        double[][] matrix = Matrix.generateMatrix(4);
        Matrix.printMatrix(matrix);
        System.out.println("#################################");
        /**
         * 1. Найти сумму элементов матрицы, расположенных между первым и вторым
         положительными элементами каждой строки.
         */
        arraysTask.getSumOfELementsInPositiveRange(matrix);
        System.out.println("#################################");

        /**
         * 2. Найти максимальный элемент (ы) в матрице и удалить из матрицы все
         строки и столбцы, его содержащие.
         */
        Matrix.printMatrix(arraysTask.deleteMaxRowsCols(matrix));
    }
}
