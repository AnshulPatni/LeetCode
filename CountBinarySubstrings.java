public class CountBinarySubstrings {

    public static void main(String[] args) {
        System.out.println(countBinarySubstrings("00110011"));  // 6
        System.out.println(countBinarySubstrings("10101"));     // 4
        System.out.println(countBinarySubstrings("1010"));     // 3
    }

    public static int countBinarySubstrings(String s) {
        int res = 0, numOnes = 0, numZeroes = 0;
        char lastChar = ' ';
        for(char c: s.toCharArray()) {
            if(c == '1') {
                if(lastChar == '0')
                    numOnes = 0;
                numOnes++;
                if(numOnes <= numZeroes)
                    res++;
                lastChar = '1';
            } else {
                if(lastChar == '1')
                    numZeroes = 0;
                numZeroes++;
                if(numZeroes <= numOnes)
                    res++;
                lastChar = '0';
            }
        }
        return res;
    }

}
