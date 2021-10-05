class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        
        Arrays.sort(nums);
        
        int i = 0;
        while (k > 0) {
            if (nums[i] < 0) {
                nums[i] = -nums[i];
                i++;
                k--;
            } else break;
        }
        
        if (k % 2 == 0) {
            int sum = 0;
            for (int x : nums) {
                sum += x;
            }
            return sum;
        } else {
            Arrays.sort(nums);
            nums[0] = -nums[0];
            int sum = 0;
            for (int x : nums) {
                sum += x;
            }
            return sum;
            
        }
    }
}