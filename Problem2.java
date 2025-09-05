// Time Complexity : O(n*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//Uses Two pointer approach to solve the current problem by sorting the array first
//Keeping first element fixed and other elements to low and high check for sum if equals to target
//skip the duplicates to avoid repeating triplets
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //3Sum with two pointers
        int target = 0;
        List<List<Integer>> li = new ArrayList<>(); 
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            int low = i+1;
            int high = nums.length - 1;
            while (low < high) {
                int res = nums[i] + nums[low] + nums[high];
                if (res == target) {
                    //found a triplet
                    li.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++; high--;
                    //check for inner duplicacy
                    while(low < high && nums[low] == nums[low-1]) low++;
                    while(low < high && nums[high] == nums[high + 1]) high--; 
                } else if(res > 0) {
                    high--;
                } else {
                    low++;
                }
            }
        }
        return li;
        
    }
}
