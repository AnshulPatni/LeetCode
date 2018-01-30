class Solution {
public:
    int romanToInt(string s) {
        int dec = 0;
        for(int i = 0; i < s.length(); i++)
        {
            char c = s[i];
            if(s[i] == 'V')
                dec = dec + 5;
            else if(s[i] == 'L')
                dec = dec + 50;
            else if(s[i] == 'D')
                dec = dec + 500;
            else if(s[i] == 'M')
                dec = dec + 1000;
            else if(c == 'I')
            {
                if(s[i + 1] == 'V')
                {
                    dec = dec + 4;
                    i = i + 1;
                }
                else if(s[i + 1] == 'X')
                {
                    dec = dec + 9;
                    i = i + 1;
                }
                else
                    dec = dec + 1; 
            }
            else if(c == 'X')
            {
                if(s[i + 1] == 'L')
                {
                    dec = dec + 40;
                    i = i + 1;
                }
                else if(s[i + 1] == 'C')
                {
                    dec = dec + 90;
                    i = i + 1;
                }
                else
                    dec = dec + 10; 
            }
            else if(c == 'C')
            {
                if(s[i + 1] == 'D')
                {
                    dec = dec + 400;
                    i = i + 1;
                }
                else if(s[i + 1] == 'M')
                {
                    dec = dec + 900;
                    i = i + 1;
                }
                else
                    dec = dec + 100; 
            }
        }
        return dec;
    }
};