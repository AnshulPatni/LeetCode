class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> temp;
        int i , j;
        for(i = 0; i < nums.size(); i++)
        {
            for (j = i + 1; j < nums.size(); j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    temp.push_back(i);
                    temp.push_back(j);
                    return temp;
                }
            }
        }
        temp.push_back(0);
        return temp;
    }
};