import java.util.*;
import java.util.Arrays;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length == 0 || nums2.length == 0)
        {
            int[] res = new int[0];
            return res;
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int len = 0;
        if(nums1.length > nums2.length)
           len = nums2.length;
       else
           len = nums1.length;
        
        int[] temp = new int[len];
        int j = 0, k = 0, flag = 0;
        int len2 = nums2.length;
        
        for(int i = 0; i < nums1.length; i++)
        {
            if(nums1[i] == nums2[j])
            {
                temp[k] = nums1[i];
                k++;
                j++;
                if( j == len2)
                    break;
            }
            else if(nums1[i] > nums2[j])
            {
                j++;
                i--;
                if( j == len2)
                    break;
            }
        }
        
        if(k == 0)
        {
            int[] res = new int[0];
            return res;
        }
        
        int[] res = new int[k];
        res = Arrays.copyOf(temp, k);
        
        return res;
    }
}