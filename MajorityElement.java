class Solution {
    public int majorityElement(int[] nums) {
        int i = 0, j = 0, temp;
        int count;
        if(nums.length == 1)
        {
            return nums[0];
        }
        
        Arrays.sort(nums);
        
        return nums[nums.length/2];
    }
}