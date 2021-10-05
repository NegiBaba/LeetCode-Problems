class Solution {
    int[] money = new int[101];
    public int rob(int[] nums) {
        Arrays.fill(money, -1);
        return choriKro(nums.length - 1, nums);
    }
    
    private int choriKro(int i, int[] nums) {
        if (i < 0) return 0;
        
        if (money[i] != -1) {
            return money[i];
        }
        
        int curr = choriKro(i - 2, nums) + nums[i];
        int prev = choriKro(i - 1, nums);
        money[i] = Math.max(curr, prev);
        
        return money[i];
    }
}