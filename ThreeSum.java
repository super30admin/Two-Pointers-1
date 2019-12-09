// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Description = For each element in the outer for loop, find the sum of remaining two elements.
class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length ==0 || nums.length < 3) return new ArrayList<>();
        
        Arrays.sort(nums);
        List<List<Integer>> output_arr = new ArrayList<>();
        
        for (int i=0; i<nums.length -2; i++) {
            
            if (i==0 || (i >0  && nums[i] != nums[i-1]))  {
                 int low = i+1;
                int high = nums.length -1;
                int sum  = 0 - nums[i];
                
                while (low < high) {
                    if (nums[low] + nums[high] == sum) {
                        output_arr.add(Arrays.asList(nums[i],nums[low],nums[high]));
                        while (low < high && nums[low] == nums[low+1]) low++;
                        while (low < high && nums[high] == nums[high-1]) high--;
                        low++;
                        high--;
                    } else if(nums[low] + nums[high] > sum) {
                         high--;
                    }else {
                        low++;
                    }
                }
            }
            
        }
        
        return output_arr;
    }
}