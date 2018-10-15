public class PlusOne {

    public static void main(String[] args) {
        int[] input1 = new int[]{1,2,9};
        int[] input2 = new int[]{4,2,2,1};
        int[] input3 = new int[]{0};
        int[] input4 = new int[]{9};

        int[] result1 = plusOne(input1);
        int[] result2 = plusOne(input2);
        int[] result3 = plusOne(input3);
        int[] result4 = plusOne(input4);

        print(result1);
        print(result2);
        print(result3);
        print(result4);
    }

    public static int[] plusOne(int[] digits) {
        for(int i = digits.length; i > 0; i--) {
            if(digits[i-1] < 9) {
                digits[i-1] = digits[i-1] + 1;
                return digits;
            } else {
                digits[i-1] = 0;
            }
        }
        if(digits[0] == 0) {
            int[] new_arr = new int[digits.length+1];
            System.arraycopy(digits, 0, new_arr, 1, digits.length);
            new_arr[0] = 1;
            return new_arr;
        }
        return digits;
    }

    public static void print(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("%5d", arr[i]);
        }
        System.out.println("\n");
    }

}
