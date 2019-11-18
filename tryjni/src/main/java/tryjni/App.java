package tryjni;

import javax.annotation.Nonnull;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(@Nonnull String[] args) {
        double[][][] matrix = new double[4][3][2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix[i][j].length; k++) {
                    matrix[i][j][k] = i + j + k;
                }
            }
        }
    }
}
