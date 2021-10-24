// Time Complexity : O(n*n)
// Space Complexity : O(1), No auxillary Space Needed
// Did this code successfully run on Leetcode : Yes, it successfully ran on Leetcode, but was a bit difficult to code and eliminate repitive cases.

// Code
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i =0; i<nums.length -2; i++){
            if(nums[i]>0){
                break;
            }
            int left = i+1;
            int right = nums.length - 1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==0){
                    List<Integer> triplets = new ArrayList<>();
                    triplets.add(nums[i]);
                    triplets.add(nums[left]);
                    triplets.add(nums[right]);
                    result.add(triplets);
                    
                    while(left<right && nums[left] == nums[left+1]){
                        left++;
                    }
                    while(left<right && nums[right] == nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }
                else if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }
            while((i<nums.length-2) && nums[i] == nums[i+1])
                i++;
        }
        return result;
    }
}