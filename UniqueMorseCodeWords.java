import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {
    public static void main(String[] args) {
        String[] words = new String[]{"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }

    public static int uniqueMorseRepresentations(String[] words) {
        String[] morse = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set set = new HashSet<String>();
        for (int i = 0; i < words.length; i++)  {
            String str = "";
            for(int j = 0; j < words[i].length(); j++)    {
                    str = str.concat(morse[(int)words[i].charAt(j)-97]);
            }
            set.add(str);
        }
        return set.size();
    }
}
