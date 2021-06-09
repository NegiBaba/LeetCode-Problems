class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        
        List<Integer> ans = new ArrayList<Integer>();
        
        Arrays.sort(nums);
        
        int arraySum = 0, currSum = 0;
        
        for ( int i = 0; i < nums.length; i++ ) {
            arraySum += nums[i];
        }
        
        
        for ( int i = nums.length - 1; i >= 0; i-- ) {
            ans.add(nums[i]);
            
            arraySum -= nums[i];
            currSum += nums[i];
            
            if ( currSum > arraySum ) return ans;
        }
        return ans;
        
    }
}