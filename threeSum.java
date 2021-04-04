 /*  Time Complexity: O(N^2) where N is the size of the array.
 *  Space Complexity: O(1) Since the result list is the return value we do not consider it towards space complexity.
 *
 *  Did this code successfully run on Leetcode : Yes
 *  Any problem you faced while coding this : Design the approach to hold the min element.
 *
 *  Explanation: If we use the brute force approach we would have solve the problem in O(n^3) time complexity. Instead we can actually sort the existing nums array first. The we pick each element and set two pointers low and hight with i+1 and length of the array-1. Now we sum the current value in the index with the value in the low and high pointer, if it is equal to the target we add it to the result, else if the target if low then sum we decrement the high else we increment the low. 
 */
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null || nums.length==0 || nums.length<3) return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); 
        for(int i=0;i<nums.length-2;i++){
            int low=i+1, high=nums.length-1;
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }
            while(low<high){
                int currSum=nums[i]+nums[low]+nums[high];
                if(currSum==0){
                    result.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    int prev = nums[low], prevHigh=nums[high];
                    low++;
                    high--;
                    while(low<nums.length && nums[low]==prev){
                        low++;
                    }
                    while(high>=0 && nums[high]==prevHigh){
                        high--;
                    }
                }else if(currSum>0){
                    high--;
                }else{
                    low++;
                }
            }
        }
        return result;
    }
}
