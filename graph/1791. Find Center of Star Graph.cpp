class Solution {
public:
    int findCenter(vector<vector<int>>& edges) {
        unordered_map<int, int> mp;
        int n = edges.size();
        
        for(int i = 0; i < edges.size(); i++)
        {
            mp[edges[i][0]]++;
            mp[edges[i][1]]++;
        }
        
        int count = 0, ans = -1;
        for(auto x : mp)
        {
            if(x.second == n)
            {
                return x.first;
            }
        }
        return -1;
    }
};