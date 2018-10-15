public class ReverseWordsInAStringIII {

    public static void main(String[] args) {
        String input = "Let's take LeetCode contest";
        String output = reverseWords(input);
        System.out.println(output);
    }

    public static String reverseWords(String s) {
        /** Method - 1 **/
        /**
         StringBuilder sb = new StringBuilder(s);
         sb.reverse();
         System.out.println(sb);
         String str = sb.toString();
         String[] a = str.split(" ");
         String new_s = "";
         System.out.println(a.length);
         for(int i = a.length - 1; i >= 0; i--)   {
             new_s = new_s + a[i] + " ";
         }
         return new_s.substring(0, new_s.length()-1);
        **/

        /** Method - 2 **/
        /**
         String new_s = "";
         String temp = "";
         for(char c : s.toCharArray())   {
         if(c == ' ') {
         new_s = new_s + temp + " ";
         temp = "";
         } else
         temp = c + temp;
         }
         new_s = new_s + temp;
         return new_s;
        **/

        /** Method -3 **/
        if(s == null || s.length() < 2)
            return s;

        char[] c_arr = s.toCharArray();
        int start = 0, end = 0;

        while((end = s.indexOf(" ", start)) > 0) {
            reverseOf(c_arr, start, end-1);
            start = end + 1;
        }
        reverseOf(c_arr, start, c_arr.length-1);
        return new String(c_arr);
    }

    public static void reverseOf(char[] ch, int start, int end)    {
        char temp;
        while(start <= end) {
            temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
    }

}
