public class Matrixr{

    public static void main(String[] args) {
        int[][] A = {
            {4, 5, 6},
            {3, 4, 1},
            {1, 2, 3}
        };

        int[][] B = {
            {2, 0, 3},
            {2, 3, 1},
            {1, 1, 1}
        };

        int[][] result = subtractMatrices(A, B);

        // Print the result
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }





        
        return result;
    }
}
