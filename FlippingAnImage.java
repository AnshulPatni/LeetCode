public class FlippingAnImage {

    public static void main(String[] args) {

        int arr1[][] = new int[][]{{1,1,0},{1,0,1},{0,0,0}};
        int arr2[][] = new int[][]{{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};

        int res1[][] = flipAndInvertImage(arr1);
        int res2[][] = flipAndInvertImage(arr2);

        System.out.println(res1);
        System.out.println(res2);

        System.out.println("Hello World!");
    }

    public static int[][] flipAndInvertImage(int[][] A) {

        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < A[i].length; j++)    {

            }
        }
        return A;
    }
}
