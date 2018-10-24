import java.util.*;

public class MostCommonWord {

    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = new String[]{"hit"};
        String paragraph1 = "a.";
        String[] banned1 = new String[]{""};
        String paragraph2 = "Bob...";
        String[] banned2 = new String[]{""};
        String paragraph3 = "a, a, a, a, b,b,b,c, c";
        String[] banned3 = new String[]{"a"};


        System.out.println(mostCommonWord(paragraph, banned));
        System.out.println(mostCommonWord(paragraph1, banned1));
        System.out.println(mostCommonWord(paragraph2, banned2));
        System.out.println(mostCommonWord(paragraph3, banned3));
    }

    public static String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> map = new HashMap<>();
        paragraph = paragraph.replaceAll(", ", " ");
        paragraph = paragraph.replaceAll(",", " ");
        paragraph = paragraph.replaceAll("\\,", "");
        paragraph = paragraph.replaceAll("\\.", "");
        paragraph = paragraph.replaceAll("!", "");
        paragraph = paragraph.replaceAll("\\?", "");
        paragraph = paragraph.replaceAll(";", "");
        paragraph = paragraph.replaceAll("'", "");
        paragraph = paragraph.toLowerCase();
        System.out.println(paragraph);
        for(int i = 0; i < banned.length; i++) {
            paragraph = paragraph.replaceAll(banned[i], "");
        }

        paragraph = paragraph.trim().replaceAll(" +", " ");
        String[] paragraphArray = paragraph.split(" ");
        System.out.println(Arrays.asList(paragraphArray));
        for(String str: paragraphArray) {
            if(map.containsKey(str))
                map.put(str, map.get(str)+1);
            else
                map.put(str, 1);
        }
        Map.Entry<String, Integer> maxEntry = null;
        for (Map.Entry<String, Integer> entry : map.entrySet())
        {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
            {
                maxEntry = entry;
            }
        }
        return maxEntry.getKey();
    }

}
