import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArray {

    public static void main(String[] args) {
        int[] nums = new int[]{4,3,2,7,8,2,3,1};
        List<Integer> list = findDuplicates(nums);
        System.out.println(list);
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
            for(int i = 0; i < nums.length; i++)    {
                int index = Math.abs(nums[i]) - 1;
                if(nums[index] < 0)
                    list.add(index+1);
                nums[index] = -nums[index];
            }
        return list;
    }

}
