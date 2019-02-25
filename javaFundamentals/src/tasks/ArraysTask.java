package tasks;
import utils.Matrix;
import java.util.Arrays;

public class ArraysTask {

    /**
     * Implementation of Task 1 from Arrays
     *
     * @param matrix
     */
    public void getSumOfELementsInPositiveRange(double[][] matrix) {
        for (double[] row : matrix) {
            double sumOfElements = 0;
            boolean isFirstPositiveSet = false;
            int[] positiveIndexes = new int[2];
            for (int index = 0; index < row.length; index++) {
                if (row[index] > 0) {
                    if (!isFirstPositiveSet) {
                        positiveIndexes[0] = index;
                        isFirstPositiveSet = true;
                    } else {
                        positiveIndexes[1] = index;
                        break;
                    }
                }
            }

            for (int i = positiveIndexes[0] + 1; i < positiveIndexes[1]; i++) {
                sumOfElements += row[i];
            }
            System.out.println("Row: " + Arrays.toString(row) + " Sum: " + sumOfElements);
        }
    }

    /**
     * Implementation of Task 2 from Arrays
     *
     * @param matrix
     * @return
     */
    public double[][] deleteMaxRowsCols(double[][] matrix) {
        double maxElement = Matrix.getMaxElement(matrix);
        double[][] newMatrix = matrix;

        while (maxElement == Matrix.getMaxElement(newMatrix)) {
            boolean stopLoop = false;
            for (int row = 0; row < newMatrix.length; row++) {
                for (int col = 0; col < newMatrix[row].length; col++) {
                    if (newMatrix[row][col] == maxElement) {
                        newMatrix = Matrix.removeRowColumn(row, col, newMatrix);
                        stopLoop = true;
                        break;
                    }
                }
                if (stopLoop) break;
            }
        }
        return newMatrix;
    }
}

