// Time Complexity : O(N^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length == 0){
            return result;
        }
        int n = nums.length;
        Arrays.sort(nums);
        // since 3 elements n-2
        for(int i = 0; i < n -2; i++){
            //skip the same element
            if(i>0 && nums[i]== nums[i-1])
                continue;
            int low = i + 1, high = n -1;
            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;
                    //check duplicate elements
                    while(low<high && nums[low] == nums[low -1])
                        low++;
                    while(low<high && nums[high] == nums[high + 1])
                        high--;
                }
                else if(sum < 0){
                    //increment the low if sum is less than 0
                    low++;
                }
                else{
                    high--;
                }
            }
        }
        return result;
    }
}