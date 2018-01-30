class Solution {
    public boolean isHappy(int n) {
        int temp = 0;
        if(n >= 0 && n <=9)
        {
            if(n == 1 || n==7)
                return true;
            else
                return false;
        }
        
        while(n != 0)
        {
            temp = temp + (n%10)*(n%10);
            n = n/10;
        }
        
        return isHappy(temp);
        
    }
}