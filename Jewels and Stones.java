class Solution {
    public int numJewelsInStones(String J, String S) {
        int temp = 0;
        char[] j_char = J.toCharArray();
        for(int i = 0; i < j_char.length; i++)  {
            temp = temp + search(S, j_char[i]);
        }
        return temp;
        
    }
    
    public int search(String str, char c)   {
        if(str.indexOf(c) >= 0)  {
            return 1 + search(str.substring(str.indexOf(c)+1), c);
        }
        else
            return 0;
    }
}