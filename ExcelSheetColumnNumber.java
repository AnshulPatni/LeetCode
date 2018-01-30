class Solution {
    public int titleToNumber(String s) {
        int val = 0, temp = 0;
        int i = 0;
        char c;
        while(i < s.length())
        {
            c = s.charAt(i);
            temp = c - 'A' + 1;
            val = val * 26 + temp;
            i++;
        }
        return val;
    }
}