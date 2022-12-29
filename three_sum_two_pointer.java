// Time Complexity : O(n^2)
// Space Complexity : O(1) - averagely
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No 


// Your code here along with comments explaining your approach


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums==null || nums.length==0) return new ArrayList<>();
        //Solution 2, 2 pointer solution O(n^2) TC, O(1)-average SC
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        // Sort using the inbuilt arrays sort function O(log(n))
        Arrays.sort(nums);
        for (int i=0; i<n-2; i++){
            // outside duplicacy
            if(i!=0 && nums[i] == nums[i-1]) continue;
            // Low and high pointer
            int low = i+1;
            int high = n-1;
            while(low<high){
                // Calculate the current sum to compare with target value
                int currentSum = nums[i] + nums[low] + nums[high];
                if(currentSum==0){
                    List<Integer> li = Arrays.asList(nums[i],nums[low],nums[high]);
                    result.add(li);
                    low++;high--;
                    // inside duplicacy to avoid calculating the same triplets
                    while(low<high && nums[low]==nums[low-1]) low++;
                    while(low<high && nums[high]==nums[high+1]) high--;
                }else if(currentSum > 0){
                    high--;
                }else{
                    low++;
                }
            }
        }
        return result;
    }
}