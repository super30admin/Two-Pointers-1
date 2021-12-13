// Time Complexity : O(nlog n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/**
 * So we iterate through all the elements of array for each imdex, we check if a pair such that sum of all three will be equal to 0.
 * While finding pair we use 2 pointer approach.
 * We start from low = index+1 and high = nums.length - 1.
 * if sum of integers present at low and high is greater than required sum ( 0 - nums[index]), we decrement high
 * If sum of integers present at low and high is lower than required sum, then we increment low
 * If we found pair then we add tripplet to our ans list.
 * Then we keep on incrementing high and decrementing low if they are pointo to same numbers (i.e. nums[high] = nums[old high] and nums[low] = nums[old low]).
 * This way can avoid dublicate tripplets for current number which is pointed by index.
 * Also while iterating through array, we increment index if it new number pointed by index is same as old number to aboid dublicate triplets 
*/


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length == 0)return new ArrayList<>(); 
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length - 1;
        
        for(int i = 0; i < nums.length;i++){
            if(i > 0 && nums[i] == nums[i-1])continue;
            int low = i+1;
            int high = n;
            int sum = 0 - nums[i];
            while(low < high){
                if(nums[low] + nums[high] == sum){
                    ans.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    while(low <= n && nums[low] == nums[low-1])low++;
                    high--;
                    while(high >= 0 && nums[high] == nums[high + 1])high--;
                }
                else if(nums[low] + nums[high] < sum){
                    low++;
                }else{
                    high--;
                }
            }
        }
        return ans;
    }
}