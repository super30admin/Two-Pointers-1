// Time Complexity : O(n2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :Got few out of bound exceptions, before arriving at this solution
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> triplet = null;
        
    Arrays.sort(nums);
    if(nums.length < 3){
        return result;
    }
    int sum =0;
    for(int i=0; i<nums.length-1;i++){
        if(i>0 && nums[i-1] == nums[i]) continue;
        
        int left = i+1;
        int right = nums.length-1;
        while(left<right){
             if (left > i+1 && nums[left] == nums[left-1]) 
            {
                left++;
            }
            else if ( right < nums.length-1 && nums[right] == nums[right+1])
            {
                right--;                
            }else{
                  sum = nums[i]+nums[left]+nums[right];
            if(sum < 0){
             left++;
            }else if(sum >0){
                right--;
            }else{
                triplet = new ArrayList<>();
                triplet.add(nums[i]);
                triplet.add(nums[left]);
                triplet.add(nums[right]);
            result.add(triplet);
                left++;right--;
        }
            }
           
        }
       
        
    }
        return result;
    
    }
       
}