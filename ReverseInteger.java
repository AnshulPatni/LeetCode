class Solution {
public:
    int reverse(int x) {
        int a = 0, prev = 0, temp = 0;
        while(x != 0)
        {
            temp = x % 10;
            a = (a * 10) + temp;
            if ((a - temp)/10 != prev)
            {
                return 0;
            }
            prev = a;
            x = x / 10;
        }
        return a;
    }
};