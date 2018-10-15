public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] nums = new int[]{1,0,1,1,0,1};

        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int consecutive = 0;
        int temp = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1)
                temp++;
            else if(nums[i] == 0) {
                    if(consecutive < temp)
                        consecutive = temp;
                    temp = 0;
            }
        }
        if(temp > consecutive)
            return temp;
        return consecutive;
    }

}
