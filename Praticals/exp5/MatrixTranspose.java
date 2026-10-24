import java.util.Scanner;

public class MatrixTranspose {
    private int[][] matrix;
    private int rows;
    private int cols;

    MatrixTranspose(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        matrix = new int[rows][cols];
    }

    void readMatrix() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    void display() {
        System.out.println("\n--- Original Matrix ---");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        int[][] transposed = transposeMatrix();
        System.out.println("\n--- Transposed Matrix ---");
        for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed[0].length; j++) {
                System.out.print(transposed[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private int[][] transposeMatrix() {
        int[][] result = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        if (rows <= 0 || cols <= 0) {
            System.out.println("Rows and columns must be greater than zero.");
            sc.close();
            return;
        }

        MatrixTranspose matrix = new MatrixTranspose(rows, cols);
        matrix.readMatrix();
        matrix.display();

        sc.close();
    }
}
