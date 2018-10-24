
public class RansomNote {

    public static void main(String[] args) {
        System.out.println(canConstruct("a", "b"));         // false
        System.out.println(canConstruct("aa", "ab"));       // false
        System.out.println(canConstruct("aa", "aab"));      // true
    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        /** Method -1 **/
        /*int index;
        for(char c: ransomNote.toCharArray()) {
            if((index=magazine.indexOf(Character.toString(c))) != -1)
                magazine = magazine.substring(0, index) + magazine.substring(index+1);
            else
                return false;
            System.out.println(magazine);
        }
        return true;*/

        /** Method - 2 **/
        int[] charArray = new int[26];
        for(char c : magazine.toCharArray()){
            charArray[c-'a']++;
        }
        for(char c : ransomNote.toCharArray()) {
            charArray[c - 'a']--;
            if(charArray[c - 'a'] < 0)
                return false;
        }
        return true;
    }

}
