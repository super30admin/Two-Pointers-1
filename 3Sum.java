// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        //Sort array
        Arrays.sort(nums);
        for(int i=0;i<n;i++) {
            if(i!=0 && nums[i] == nums[i-1]) continue;
            int low = i+1;
            int high = n-1;
            while(low<high) {
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0) {
                    //See if the sum becomes 0
                    ArrayList<Integer> temp = new ArrayList<Integer>();
                    temp.add(nums[i]);
                    temp.add(nums[low]);
                    temp.add(nums[high]);
                    result.add(temp);
                    low++; high--;
                    //Don't consider the same numbers to eliminate duplicates
                    while(low<high && nums[low] == nums[low-1]) low++;
                    while(low<high && nums[high] == nums[high+1]) high--;
                } else if(sum > 0) {
                    high--;
                } else {
                    low++;
                }
            }
        }
        return result;
    }
}
