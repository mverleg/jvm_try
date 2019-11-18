package tryjni;

import javax.annotation.Nonnull;

/**
 * Hello world!
 */
public class App {
    public static void main(@Nonnull String[] args) {
        make3D(4, 3, 2);
        make2D(4, 3);
    }

    public static double[][] make2D(int a, int b) {
        double[][]matrix = new double[a][b];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 1 + b * i + j;
            }
        }
        return matrix;
    }

    public static double[][][] make3D(int a, int b, int c) {
        double[][][] matrix = new double[a][b][c];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix[i][j].length; k++) {
                    matrix[i][j][k] = 1 + b * c * i + c * j + k;
                }
            }
        }
        return matrix;
    }
}
