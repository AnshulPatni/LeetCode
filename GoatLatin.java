public class GoatLatin {

    public static void main(String[] args) {
        String s = "I speak Goat Latin";
        String s2 = "The quick brown fox jumped over the lazy dog";

        System.out.println(toGoatLatin(s));
        System.out.println(toGoatLatin(s2));
    }

    public static String toGoatLatin(String S) {
        String[] strArr = S.split(" ");
        String new_str = "";
        for(int i = 0; i < strArr.length; i++) {
            replace(strArr, i);
            new_str = new_str + strArr[i] + " ";
        }
        return new_str.substring(0, new_str.length()-1);
    }

    public static void replace(String[] str, int i) {
        char c = Character.toLowerCase(str[i].charAt(0));
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            str[i] = str[i] + "ma";
        else
            str[i] = str[i].substring(1) + str[i].substring(0, 1) + "ma";

        for(int j = 0; j <= i; j++) {
            str[i] = str[i] + "a";
        }
    }

}
