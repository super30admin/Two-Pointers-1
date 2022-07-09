// Time Complexity :O(n2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yess
// Any problem you faced while coding this : Boundary conditions.


// Your code here along with comments explaining your approach

public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> result = new ArrayList<>();
    
    for(int i=0;i<nums.length;i++){
        if(i>0 && nums[i] == nums[i-1]){
            continue;
        }
    int left=i+1;
    int right = nums.length-1;
    while(left<right){
        int sum = nums[i]+nums[left] + nums[right];
        if(sum == 0){
            result.add(Arrays.asList(nums[i],nums[left],nums[right]));
            left++;
            right--;
            while(left < right && nums[left] == nums[left-1]){
                left++;
            }
            while(left < right&& nums[right] == nums[right+1]){
                right--;
            }
        }else if(sum < 0){
            left++;
        }else{
            right--;
        }
    }
        
    }
    return result;
}