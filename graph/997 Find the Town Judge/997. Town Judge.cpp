class Solution {
public:
    int findJudge(int n, vector<vector<int>>& trust) {
        vector<int> indegree(n + 1, 0);
        vector<int> outdegree(n + 1, 0);
        
        for(int i = 0; i < trust.size(); i++)
        {
            outdegree[trust[i][0]]++;
            indegree[trust[i][1]]++;
        }
        
        int count = 0, ans = -1;
        for(int i = 1; i <= n; i++)
        {
            if(indegree[i] == (n - 1) && outdegree[i] == 0) 
            {
                count++;
                ans = i;
            }
        }
        if(count > 1) return -1;
        return ans;
    }
};