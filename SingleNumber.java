import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        int result = nums[0];        
        for(int i = 0; i < nums.length-1; i++)
        {
            result = result ^ nums[i+1];
        }
        return result;
    }
}