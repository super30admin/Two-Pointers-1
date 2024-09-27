// Time Complexity :O(n^2)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : Referred a solution


// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> triplets = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            //avoid duplicates
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
        searchTriplets(nums, -nums[i], i+1, triplets);         
        }
        return triplets;
    }
    
    public static void searchTriplets(int[] nums, int targetSum, int left, List<List<Integer>> triplets){
        int right = nums.length - 1;
        while(left<right){
            int currentSum = nums[left] + nums[right];
            
            if(currentSum == targetSum){
                triplets.add(Arrays.asList(-targetSum,nums[left],nums[right]));
                left++;
                right--;
                //avoid duplicates
            while(left<right && nums[left] == nums[left-1]){
                left++;
            }
                //avoid duplicates
            while(left<right && nums[right] == nums[right+1]){
                right--;
            }               
            }
            else if(currentSum < targetSum){
                left++;
            }else{
                right--;
            }
        }        
    }
}