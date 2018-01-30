class Solution {
    public boolean isPowerOfThree(int n) {
        /*if(n == 0)
            return false;
        else if(n == 1)
            return true;
        double logvalue = Math.log(n) / Math.log(3);
         System.out.println(logvalue);
        System.out.println(Math.abs(Math.ceil(logvalue) - logvalue));
       if(Math.abs(Math.ceil(logvalue) - logvalue) <= 0.000000000000001)
           return true;
        return false;*/
        if(n <= 0)
            return false;
        if(n == 1)
            return true;
        while(n > 1)
        {    
            if(n % 2 == 0 || n % 3 != 0)
                return false;   
            n = n/3;
        }
        return true;
    }
}