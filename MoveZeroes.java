class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0, j = 0, temp;
        while(i < nums.length)
        {
            if(nums[i] != 0)
            {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
            i++;
        }
    }
}
