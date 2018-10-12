public class FlippingAnImage {

    public static void main(String[] args) {

        int arr1[][] = new int[][]{{1,1,0},{1,0,1},{0,0,0}};
        // expected output: {{1, 0, 0}, {0, 1, 0}, {1, 1, 1}}
        int arr2[][] = new int[][]{{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};

        int res1[][] = flipAndInvertImage(arr1);
        int res2[][] = flipAndInvertImage(arr2);
        printGrid(arr1);
        printGrid(arr2);

    }

    public static void printGrid(int[][] arr) {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                System.out.printf("%5d ", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] flipAndInvertImage(int[][] A) {

        for(int i = 0; i < A.length; i++)   {
            int len = A[i].length;
            int a[] = A[i]; // 1, 1, 0
            int loopLength = 0;
            if(len % 2 == 1)    {
                loopLength = len - 1;
                if(a[len/2] == 0)
                    a[len/2] = 1;
                else
                    a[len/2] = 0;
            } else {
                loopLength = len;
            }

            for(int j = 0; j < loopLength / 2; j++)    {
                if(a[j] == 0)
                    a[j] = 1;
                else
                    a[j] = 0;
                if(a[len - (j + 1)] == 0)
                    a[len - (j + 1)] = 1;
                else
                    a[len - (j + 1)] = 0;

                int temp = a[j];
                a[j] = a[len - (j + 1)];
                a[len - (j + 1)] = temp;
            }
        }
        return A;
    }
}
