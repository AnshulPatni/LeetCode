public class ToLowerCase {

    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println(toLowerCase(str));
    }

    public static String toLowerCase(String str) {
        StringBuilder myName = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++)  {
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                myName.setCharAt(i, (char)((int)str.charAt(i) + 32));
            }
        }
        return myName.toString();
    }
}
