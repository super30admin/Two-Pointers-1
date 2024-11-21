// Time Complexity : O(n^2). n is the length of the array
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length == 0)
			return new ArrayList();
		HashSet<List<Integer>> hashSet = new HashSet();
		Arrays.sort(nums);
		
		for (int i = 0; i < nums.length - 2; i++) {
            if ((i > 0) && (nums[i - 1] == nums[i])) continue;
			int j=i+1;
			int k=nums.length-1;
			while(j<k) {
				int sum = nums[i]+nums[j]+nums[k];
				if(sum==0) {
					
					List<Integer>arrayList = 
							Arrays.asList(nums[i],nums[j],nums[k]);
					hashSet.add(arrayList);
					j++;k--;
				}else if(sum>0) {
					k--;
				}else {
					j++;
				}
			}
		}
		return new ArrayList(hashSet);
    }
}
