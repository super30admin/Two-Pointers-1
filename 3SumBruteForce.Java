// Time Complexity : O(n^3). n is the length of the array
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : No(Time Limit Exceeded)
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null || nums.length==0)
				return new ArrayList();
			//List<List<Integer>> arrayList = new ArrayList<List<Integer>>();
			HashSet<List<Integer>>hashSet = new HashSet();
			for(int i=0;i<nums.length-2;i++) {
				for(int j=i+1;j<nums.length-1;j++) {
					int iJsum = nums[i]+nums[j];
					for(int k=j+1;k<nums.length;k++) {
						if(iJsum+nums[k]==0) {
							List<Integer>list = Arrays.asList(nums[i],nums[j],nums[k]);
							Collections.sort(list);
							hashSet.add(list);
						}
					}
				}
			}
			return new ArrayList(hashSet);
    }
}
