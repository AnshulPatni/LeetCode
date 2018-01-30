class Solution {
    public int firstUniqChar(String s) {
        int flag = 0;
        int[] alpha = new int[26];
        boolean check = true;
        char[] c = s.toCharArray();
        //System.out.println(c[c.length-1]);
        for(int i = 0; i < c.length; i++)
        {
            flag = 0;
            for(int j = 0; j < c.length; j++)
            {
                if((i != j) && (c[i] == c[j]))
                {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0)
                return i;
        }
        return -1;
    }
}