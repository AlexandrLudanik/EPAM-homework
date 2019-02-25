package tasks;

public class Operators {
    /**
     * Implementation of Task 1 from Operators
     *
     * @param k        is a integer for check if it belongs to interval
     * @param interval two values array of integer for check
     * @return returns true in case k belongs to interval false otherwise
     */
    public boolean isBelongsToInterval(int k, int[] interval) {

        if (interval.length != 2) {
            System.out.println("Hmm...Please limit your interval with two values.");
        } else {
            if (k >= Math.min(interval[0], interval[1]) &&
                    k <= Math.max(interval[0], interval[1]))
                return true;
            else
                return false;
        }
        return false;
    }

    /**
     * Implementation of Task 2 from Operators
     *
     * @param monthNumber month number
     */
    public void printMonth(int monthNumber) {

        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Нет месяца с номерм " + monthNumber +
                    " Введите целое число в интервале 1 - 12");
        }

        String monthName = "";

        switch (monthNumber) {
            case 1:
                monthName = "Январь";
                break;
            case 2:
                monthName = "Февраль";
                break;
            case 3:
                monthName = "Март";
                break;
            case 4:
                monthName = "Аперль";
                break;
            case 5:
                monthName = "Май";
                break;
            case 6:
                monthName = "Июнь";
                break;
            case 7:
                monthName = "Июль";
                break;
            case 8:
                monthName = "Август";
                break;
            case 9:
                monthName = "Сентябрь";
                break;
            case 10:
                monthName = "Октябрь";
                break;
            case 11:
                monthName = "Ноябрь";
                break;
            case 12:
                monthName = "Декабрь";
                break;
            default:
                break;
        }
        System.out.println(monthName);
    }
}

