class Solution {
    public String reverseString(String s) {
        char rev[] = s.toCharArray();
        char temp;
        int iterations;
        if(s.length() == 1)
        {
            return s;
        }
        else if(s.length() == 2)
        {
            temp = rev[0];
            rev[0] = rev[1];
            rev[1] = temp;
            return String.valueOf(rev);
        }
        
        if(s.length() % 2 == 0)
            iterations = (s.length() / 2);
        else
            iterations = (s.length() / 2) + 1;
        
        for(int i = 0; i < iterations; i++)
        {
            temp = rev[i];
            rev[i] = rev[s.length() - (i + 1)];
            rev[s.length() - (i + 1)] = temp;
        }
        return String.valueOf(rev);
    }
}