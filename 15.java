// Sort the array - 

// to remove duplicates

// Three pointer approach

// sum = 0  ---> stop
// sum < 0 ----> left++
// sum > 0 ----> right++

// when left == right ---> increment i and reset the pointers left and right. 

// TC - O(N square)
// SC -  O(1) Constant

// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        if( nums == null || nums.length == 0) return new ArrayList<>();
        
        Arrays.sort(nums);
        
        List<List<Integer>> result = new ArrayList();
        
        for(int i = 0; i< nums.length -2; i++){
            if( i != 0 && nums[i-1] == nums[i]) continue;
            
            int left = i+1;
            int right = nums.length -1;
            
            //Finding Triplets
            while(left < right){
                int curSum = nums[i] + nums[left] + nums[right];
                if(curSum == 0){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    while(left < right && nums[left] == nums[left-1]) left++;
                    right--;
                    while(left < right && nums[left] == nums[left-1]) left++;
                } else if(curSum < 0) {
                    left++;
                    while(left < right && nums[left] == nums[left-1]) left++;
                } else {
                    right--;
                    while(left < right && nums[left] == nums[left-1]) right--;
                }
            }
        }
    return result;
    }
}