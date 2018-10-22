import java.util.HashMap;
import java.util.Map;

public class NextGreaterElementI {

    public static void main(String[] args) {
        int[] nums1 = new int[]{4,1,2};
        int[] nums2 = new int[]{1,3,4,2};
        int[] nums3 = new int[]{2,4};
        int[] nums4 = new int[]{1,2,3,4};

        int[] res1 = nextGreaterElement(nums1, nums2);
        int[] res2 = nextGreaterElement(nums3, nums4);

        print(res1);
        print(res2);
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums2.length; i++)
            map.put(nums2[i], i);
        for(int i= 0; i < nums1.length; i++) {
            int j = map.get(nums1[i]) + 1;
            for(; j < nums2.length; j++) {
                if(nums1[i] < nums2[j]) {
                    res[i] = nums2[j];
                    break;
                }
            }
            if(j == nums2.length)
                res[i] = -1;
        }
        return res;
    }

    public static void print(int[] res) {
        for(int i = 0; i < res.length; i++)
            System.out.printf("%5d", res[i]);
        System.out.println();
    }

}
