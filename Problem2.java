//Time Complexity : O(n^2)
//Space Complexity: O(1), since problem itself requires a List Output.
//Code run successfully on LeetCode.

public class Problem2 {

	public List<List<Integer>> threeSum(int[] nums) {
		
	if(nums == null || nums.length == 0)
		return new ArrayList<>();
	
	Arrays.sort(nums);
	int left =0;
	int right =0;
	int n = nums.length;
	
	List<List<Integer>> result = new ArrayList<>();
	
	for(int i =0; i < n; i++) {
		
		if( i>0 && nums[i] == nums[i-1])
			continue;
		if(nums[i] > 0)
			break;
		left = i+1;
		right = n-1;

		while(left < right) {
			if(nums[i] + nums[left] + nums[right] < 0)
				left++;
			else if(nums[i] + nums[left] + nums[right] > 0)
				right--;
			else
			{
				result.add(Arrays.asList(nums[i],nums[left],nums[right]));
				left++;
				right--;
				
				while(left < right && nums[left] == nums[left -1])
					left ++;
				while(left < right && nums[right] == nums[right +1])
					right--;
			}
		}
	}
    return result;
}
}
