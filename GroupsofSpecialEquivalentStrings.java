import java.util.HashMap;

public class GroupsofSpecialEquivalentStrings {

    public static void main(String[] args) {
        String[] input1 = new String[]{"a","b","c","a","c","c"};
        String[] input2 = new String[]{"aa","bb","ab","ba"};
        String[] input3 = new String[]{"abc","acb","bac","bca","cab","cba"};
        String[] input4 = new String[]{"abcd","cdab","adcb","cbad"};

        System.out.println(numSpecialEquivGroups(input1));
        System.out.println(numSpecialEquivGroups(input2));
        System.out.println(numSpecialEquivGroups(input3));
        System.out.println(numSpecialEquivGroups(input4));

    }

    public static int numSpecialEquivGroups(String[] A) {
        int result = 0;
        HashMap<String, String[]> map = new HashMap<>();
        for(int i = 0; i < A.length; i++) {
            if(map.isEmpty()) {
                String[] arr = new String[]{A[i]};
                map.put(A[i], arr);
            } else {

            }
        }
        return result;
    }

}
