public class MonotonicArray {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,2,3};
        int[] arr2 = new int[]{6,5,4,4};
        int[] arr3 = new int[]{1,3,2};
        int[] arr4 = new int[]{1,2,4,5};
        int[] arr5 = new int[]{1,1,1};
        int[] arr6 = new int[]{2,2,2,1,4,5};
        int[] arr7 = new int[]{1,1,0};

        System.out.println(isMonotonic(arr1));
        System.out.println(isMonotonic(arr2));
        System.out.println(isMonotonic(arr3));
        System.out.println(isMonotonic(arr4));
        System.out.println(isMonotonic(arr5));
        System.out.println(isMonotonic(arr6));
        System.out.println(isMonotonic(arr7));
    }

    public static boolean isMonotonic(int[] A) {
        /** Method -1 **/

        /**
        if(A.length < 3) {
            return true;
        }
        int flag = 0;
        if(A[0] < A[1])
            flag = -1;
        else if (A[0] > A[1])
            flag = 1;

        for(int i = 0; i < A.length-1; i++)   {
            if(A[i] < A[i+1] && flag != -1)
                if(flag == 0)
                    flag = -1;
                else
                    return false;
            else if(A[i] > A[i+1] && flag != 1)
                if(flag == 0)
                    flag = 1;
                else
                return false;
        }
        return true;
        **/

        /** Method - 2 **/

        boolean increment = (A[A.length - 1] - A[0] > 0);
        for(int i = 0; i < A.length-1; i++) {
            if(increment && A[i+1] < A[i]) {
                return false;
            } else if(!increment && A[i+1] > A[i]) {
                return false;
            }
        }
        return true;
    }

}
