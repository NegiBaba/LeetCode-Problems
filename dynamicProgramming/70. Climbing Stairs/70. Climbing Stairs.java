class Solution {
    int count[] = new int[46];
    public int getCount(int i) {
        if (i < 0) return 0;
        
        if(i == 0) return 1;
        
        if (count[i] != -1) {
            return count[i];
        }
        
        count[i] = getCount(i - 1) + getCount(i - 2);
        return count[i];
        
    }
    public int climbStairs(int n) {
        Arrays.fill(count, -1);
        return getCount(n);
    }
}