public class LengthOfLastWord {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));        // 5
        System.out.println(lengthOfLastWord(""));                   // 0
        System.out.println(lengthOfLastWord(" "));                  // 0
        System.out.println(lengthOfLastWord("Hello World       ")); // 5
    }

    public static int lengthOfLastWord(String s) {
        if(s.equals("") || s.equals(" "))
            return 0;
        s = s.trim();
        String[] str = s.split(" ");
        return str[str.length-1].length();
    }

}
