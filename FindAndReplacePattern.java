import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAndReplacePattern {

    public static void main(String[] args) {
        String[] words = new String[]{"abc","deq","mee","aqq","dkd","ccc"};
        String pattern = "abb";
        List<String> l = findAndReplacePattern(words, pattern);
        System.out.println(l);
    }

    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < words.length; i++) {
            int flag = 0;
            HashMap<Character, Character> map = new HashMap<Character, Character>();
            String s = words[i];
            if(s.length() == pattern.length()) {
                for(int j = 0; j < s.length(); j++) {
                    if(map.containsKey(pattern.charAt(j)))    {
                        if(map.get(pattern.charAt(j)) != s.charAt(j)) {
                            flag = 1;
                            break;
                        }
                    } else {
                        if(map.containsValue(s.charAt(j)))  {
                            flag = 1;
                            break;
                        } else{
                            map.put(pattern.charAt(j), s.charAt(j));
                        }
                    }
                }

                if(flag == 0)
                    list.add(words[i]);
            }
        }
        return list;
    }

}
