public class DetectCapital {

    public static void main(String[] args) {
        System.out.println(detectCapitalUse("USA"));    // true
        System.out.println(detectCapitalUse("FlaG"));   // false
        System.out.println(detectCapitalUse("Flag"));   // true
        System.out.println(detectCapitalUse("flag"));   // true
    }

    public static boolean detectCapitalUse(String word) {
        if(word.equals(word.toUpperCase()))
            return true;
        else if(word.equals(word.toLowerCase()))
            return true;
        else if(word.substring(1).equals(word.substring(1).toLowerCase()))
            return true;
        return false;
    }

}
