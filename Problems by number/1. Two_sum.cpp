class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> mp;
        vector<int> ans = {0, 0};
        
        for(int i = 0; i < nums.size(); i++)
        {
            if(mp[target - nums[i]] > 0) 
            {
                ans[0] = i;
                ans[1] = target - nums[i];
                break;
            }
            else mp[nums[i]]++;
        }
        for(int i = 0; i < nums.size(); i++)
        {
            if(nums[i] == ans[1] and i != ans[0])
            {
                ans[1] = i;
                break;
            }
        }
        return ans;
    }
};