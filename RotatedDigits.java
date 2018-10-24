import java.util.HashSet;
import java.util.Set;

public class RotatedDigits {
    /** Method - 1 **/
    /*public static Set<Integer> set = new HashSet<>();
    public static void main(String[] args) {
        System.out.println(rotatedDigits(857));
    }

    public static int rotatedDigits(int N) {
        for(int i = 1; i <= N; i++) {
            if ((Integer.toString(i).contains("2") || Integer.toString(i).contains("5") || Integer.toString(i).contains("6") || Integer.toString(i).contains("9")) && !Integer.toString(i).contains("7") && !Integer.toString(i).contains("3") && !Integer.toString(i).contains("4")) {
                set.add(i);
            }
        }
        return set.size();
    }*/

    /** Method - 2 **/
    public static void main(String[] args) {
        System.out.println(rotatedDigits(857));
    }

    public static int rotatedDigits(int N) {
        int res = 0;
        for(int i = 0; i <= N; i++) {
            if(checkValid(i))
                res++;
        }
        return res;
    }

    public static boolean checkValid(int N) {
        boolean check = false;
        while(N != 0) {
            if(N % 10 == 2 || N % 10 == 5 || N % 10 == 6 || N % 10 == 9)
                check = true;
            if(N % 10 == 3 || N % 10 == 4 || N % 10 == 7)
                return false;
            N = N / 10;
        }
        return check;
    }

}
