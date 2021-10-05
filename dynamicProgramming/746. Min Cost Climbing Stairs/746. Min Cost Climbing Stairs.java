class Solution {
    int[] stair = new int[1001];
    
    public int climbStair(int curr, int[] cost) {
        if (curr <= 1) {
            return 0;
        }
        
        if (stair[curr] != -1) {
            return stair[curr];
        }
        
        int first = cost[curr - 1] + climbStair(curr - 1, cost);
        int second = cost[curr - 2] + climbStair(curr - 2, cost);
        stair[curr] = Math.min(first, second);
        return stair[curr];
    }
    public int minCostClimbingStairs(int[] cost) {
        Arrays.fill(stair, -1);
        
        return climbStair(cost.length, cost);
    }
}