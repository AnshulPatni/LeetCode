public class TransposeMatrix {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}}; // Output: [[1,4,7],[2,5,8],[3,6,9]]
        int[][] matrix2 = new int[][]{{1,2,3},{4,5,6}};

        int[][] trans_matrix = transpose(matrix);
        int[][] trans_matrix2 = transpose(matrix2);

        for(int i = 0; i < trans_matrix2.length; i++)   {
            for(int j = 0; j <  trans_matrix2[i].length; j++)    {
                System.out.printf("%5d", trans_matrix2[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int[][] A) {
        int len = A[0].length;
        int[][] trans_mat = new int[len][A.length];
        for(int i = 0; i < A.length; i++)   {
            int[] a = A[i].clone();
            for(int j = 0; j < A[i].length; j++)    {
                trans_mat[j][i] = a[j];
            }
        }
        return trans_mat;
    }

}
