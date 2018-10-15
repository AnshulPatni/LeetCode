import java.util.Arrays;
import java.util.stream.Stream;

public class ReshapeTheMatrix {

    public static void main(String[] args) {
//        int[][] mat = new int[][]{{1,2},{3,4}};
        int[][] mat = new int[][]{{1},{2},{3},{4}};
//        int r = 1, c = 4;
        int r = 2, c = 2;
        int[][] res = matrixReshape(mat, r, c);

        for(int i = 0; i < res.length; i++) {
            for(int j = 0; j < res[i].length; j ++) {
                System.out.println(res[i][j]);
            }
        }
    }

    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        if(r*c != nums.length*nums[0].length)
            return nums;

        int[][] res = new int[r][c];
        int[] mergedArray = new int[r*c];
        int a = 0, b = nums[0].length;
        for(int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i][0]);
            System.arraycopy(nums[i], 0, mergedArray, a, b);
            a = a + nums[i].length;
            b = nums[i].length;
        }

//        for(int i = 0; i < mergedArray.length; i++) {
//            System.out.println(mergedArray[i]);
//        }

        int x = 0;
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                res[i][j] = mergedArray[x];
                x++;
            }
        }

        return res;
    }

}
