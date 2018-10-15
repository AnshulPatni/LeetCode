import java.util.Arrays;

public class SortArrayByParity {

    public static void main(String[] args) {
        int[] arr1 = new int[]{3,1,2,4};

        System.out.println(Arrays.toString(sortArrayByParity(arr1)));
    }

    public static int[] sortArrayByParity(int[] A) {
        int[] res = new int[A.length];
        int even = 0;
        int odd = A.length - 1;
        for(int i = 0; i < A.length; i++)   {
            if(A[i] % 2 == 0) {
                res[even] = A[i];
                even++;
            } else {
                res[odd] = A[i];
                odd--;
            }
        }
        return res;
    }

}
