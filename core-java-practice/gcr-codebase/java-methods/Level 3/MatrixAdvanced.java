import java.util.Random;

public class MatrixAdvanced {

    public static double[][] createRandomMatrix(int rows, int cols) {
        Random random = new Random();
        double[][] matrix = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(9) + 1;
            }
        }

        return matrix;
    }

    public static double[][] transpose(double[][] matrix) {
        double[][] result = new double[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    public static double determinant2x2(double[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    public static double determinant3x3(double[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    public static double[][] inverse2x2(double[][] m) {

        double det = determinant2x2(m);

        if (det == 0) {
            return null;
        }

        return new double[][]{
                {m[1][1] / det, -m[0][1] / det},
                {-m[1][0] / det, m[0][0] / det}
        };
    }

    public static void displayMatrix(double[][] matrix) {

        if (matrix == null) {
            System.out.println("Inverse does not exist.");
            return;
        }

        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%.2f\t", value);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        double[][] matrix2 = createRandomMatrix(2, 2);
        double[][] matrix3 = createRandomMatrix(3, 3);

        System.out.println("2x2 Matrix:");
        displayMatrix(matrix2);

        System.out.println("\nTranspose:");
        displayMatrix(transpose(matrix2));

        System.out.println("\nDeterminant (2x2): " + determinant2x2(matrix2));

        System.out.println("\nInverse (2x2):");
        displayMatrix(inverse2x2(matrix2));

        System.out.println("\n3x3 Matrix:");
        displayMatrix(matrix3);

        System.out.println("\nDeterminant (3x3): " + determinant3x3(matrix3));
    }
}
