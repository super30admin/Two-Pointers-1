// Time Complexity : O(n2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class ThreeSum {
    // -4 -1 -1 0 1 2
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length<3)
            return new ArrayList<>();
        
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i=0;i<nums.length-2;i++) {
            if(i>0 && nums[i]==nums[i-1])
                continue;
            
            if(nums[i]>0)
                break;
            
            left = i+1;
            right = nums.length-1;
            
            while(left<right) {
                int sum = nums[i]+nums[left]+nums[right];
                if(sum == 0) {
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                    
                    while(left<right && nums[left]==nums[left-1])
                        left++;
                    
                    while(right > left && nums[right]==nums[right+1])
                        right--;
                }else if(sum>0){
                    right--;
                }else {
                    left++;
                }
            }
        }
        
        return result;
    }
}
