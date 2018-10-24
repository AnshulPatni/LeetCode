import java.util.*;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] input1 = new String[]{"flower","flow","flight"};
        String[] input2 = new String[]{"dog","racecar","car"};
        String[] input3 = new String[]{};
        String[] input4 = new String[]{"c","c"};

        System.out.println(longestCommonPrefix(input1));
        System.out.println(longestCommonPrefix(input2));
        System.out.println(longestCommonPrefix(input3));
        System.out.println(longestCommonPrefix(input4));
    }

    public static String longestCommonPrefix(String[] strs) {

        /** MEthod -1 **/
        /*String res = "";
        if(strs.length == 0)
            return "";
        else if(strs.length == 1)
            return strs[0];
        else {
            Arrays.sort(strs, new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    *//*return s1.compareTo(s2);*//*            // default sort function
                    return s1.length() - s2.length();
                }
            });

            System.out.println(Arrays.asList(strs));

            for (int i = 0; i < strs[0].length(); i++) {
                for (int j = 0; j < strs.length - 1; j++) {
                    if (!strs[j].substring(i, i + 1).equals(strs[j + 1].substring(i, i + 1)))
                        return res;
                }
                res = strs[0].substring(0, i + 1);
            }
        }

        return res;*/

        /** Method - 2 **/

        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }

}
