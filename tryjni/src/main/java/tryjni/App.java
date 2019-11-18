package tryjni;

import javax.annotation.Nonnull;

/**
 * Hello world!
 */
public class App {
	public static void main(@Nonnull String[] args) {
		System.loadLibrary("App");
		new App().go();
	}

	public void go() {
		double[][] A = make2D(4, 5);
		double[][] B = make2D(5, 3);
		double[][] C = mul22(A, B);
		print(C);
	}

	@Nonnull
	public static native double[][] mul22(@Nonnull double[][] left, @Nonnull double[][] right);

	public static double[][] make2D(int a, int b) {
		double[][] matrix = new double[a][b];
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

	public static void print(@Nonnull double[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(String.format("%6.3f  ", matrix[i][j]));
			}
			System.out.println();
		}
	}
}
