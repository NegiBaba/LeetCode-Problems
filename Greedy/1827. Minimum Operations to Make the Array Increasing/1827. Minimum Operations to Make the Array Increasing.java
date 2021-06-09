/*
array length is array_name.length
string length is string_name.length()
*/
class Solution {
	public int minOperations(int[] nums) {
		int ans = 0;

		for ( int i = 0; i < nums.length - 1; i++ ) {
			if ( nums[i] >= nums[i + 1] ) {
				ans += ( nums[i] - nums[i + 1] + 1 );
				nums[i + 1] = nums[i];
			}
		}
		return ans;
	}
}