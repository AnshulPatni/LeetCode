import java.util.ArrayList;
import java.util.List;

public class ReverseVowelsOfAString {

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));         // "holle"
        System.out.println(reverseVowels("leetcode"));      // "leotcede"
        System.out.println(reverseVowels("aA"));      // "Aa"
    }

    public static String reverseVowels(String s) {
        char[] c = s.toCharArray();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < c.length; i++) {
            if(Character.toLowerCase(c[i]) == 'a' || Character.toLowerCase(c[i]) == 'e' || Character.toLowerCase(c[i]) == 'i' || Character.toLowerCase(c[i]) == 'o' || Character.toLowerCase(c[i]) == 'u')
                list.add(i);
        }

        for(int j = 0; j < list.size()/2; j++) {
            char temp = c[list.get(j)];
            c[list.get(j)] = c[list.get(list.size()-1-j)];
            c[list.get(list.size()-1-j)] = temp;
        }
        return new String(c);
    }

}
