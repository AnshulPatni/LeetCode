public class ToeplitzMatrix {

    public static void main(String[] args) {
        int[][] mat = new int[][]{{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        int[][] mat2 = new int[][]{{1,2},{2,2}};
        System.out.println(isToeplitzMatrix(mat));
        System.out.println(isToeplitzMatrix(mat2));
    }

    public static boolean isToeplitzMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length - 1; i++) {
            for(int j = 0; j < matrix[i].length - 1; j++) {
                if(matrix[i][j] != matrix[i+1][j+1])
                    return false;
            }
        }
        return true;
    }

}
