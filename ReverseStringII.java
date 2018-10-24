public class ReverseStringII {

    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 2));   // "bacdfeg"
        System.out.println(reverseStr("a", 2));   // "bacdfeg"
        System.out.println(reverseStr("abcd", 4));   // "dcba"
        System.out.println(reverseStr("abcdefg", 8));   // "gfedcba"

    }

    /** Method - 1 **/
    /*public static String reverseStr(String s, int k) {
        for(int i = 0; i < s.length(); i++) {
            if(k <= s.substring(i).length()) {
                String rev = reverse(s.substring(i, i+k));
                s = s.substring(0, i) + rev + s.substring(i+k);
                i = i + 2*k - 1;
            } else  {
                String rev = reverse(s.substring(i));
                s = s.substring(0, i) + rev;
                i = i + 2*k - 1;
            }
        }
        return s;
    }

    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }

    *//*public static String reverse(String s) {
        String rev = "";
        for(char c: s.toCharArray())
            rev = Character.toString(c) + rev;
        return rev;
    }*/

    /** Method - 2 **/
    public static String reverseStr(String s, int k) {
        char[] c = s.toCharArray();
        for(int i = 0; i < c.length; i = i+2*k) {
            int start = i;
            int end = Math.min(start + k-1, c.length - 1);
            while(start < end) {
                char temp = c[start];
                c[start++] = c[end];
                c[end--] = temp;
            }
        }
        return new String(c);
    }

}
