import java.util.*;

public class GroupsOfSpecialEquivalentStrings {

    public static void main(String[] args) {
        String[] input1 = new String[]{"a","b","c","a","c","c"};                // 3
        String[] input2 = new String[]{"aa","bb","ab","ba"};                    // 4
        String[] input3 = new String[]{"abc","acb","bac","bca","cab","cba"};    // 3
        String[] input4 = new String[]{"abcd","cdab","adcb","cbad"};            // 1
        String[] input5 = new String[]{"zknd","ndzk","ndzk","zknd","ndzk"};     // 1

        System.out.println(numSpecialEquivGroups(input1));
        System.out.println(numSpecialEquivGroups(input2));
        System.out.println(numSpecialEquivGroups(input3));
        System.out.println(numSpecialEquivGroups(input4));
        System.out.println(numSpecialEquivGroups(input5));
    }

    public static int numSpecialEquivGroups(String[] A) {
//        int groups = 0;
        Set<String> set = new TreeSet<>();
        for(int i = 0; i < A.length; i++) {
            if(A[i].length() < 3)
                set.add(A[i]);
            else {
                String newStr = build(A[i]);
                if(!set.contains(newStr))
                    set.add(newStr);
            }
        }
        return set.size();
    }

    public static String build(String s) {
        char[] c = s.toCharArray();
        String newStr = "";
        List<Character> listEven = new ArrayList<>();
        List<Character> listOdd = new ArrayList<>();
        for(int i = 0; i < c.length; i++) {
            if(i % 2 == 0) {
                listEven.add(c[i]);
            } else {
                listOdd.add(c[i]);
            }
        }
        Collections.sort(listEven);
        Collections.sort(listOdd);
        for(int i = 0; i < c.length; i++) {
            if(i % 2 == 0) {
                newStr = newStr + listEven.get(i/2).toString();
            } else {
                newStr = newStr + listOdd.get(i/2).toString();
            }
        }
        return newStr;
    }
}
