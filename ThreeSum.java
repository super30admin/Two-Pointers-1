// Time Complexity : O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // Sort array so two pointer could be used
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < nums.length && nums[i]<=0; i++){ // for each element until they are all negetive since if there are postive they can't form target zero
            if(i==0 || nums[i-1]!=nums[i]){
                twoSum(nums, i, result);
            }
        }
        return result;
    }
    
    // Two pointer 2sum approach but check if target equals zero
    private void twoSum(int[] nums, int i, List<List<Integer>> result){
        int low = i+1;
        int high = nums.length - 1;
        int sum = -1;
        while(low < high){
            sum = nums[low] + nums[high] + nums[i];
            if(sum<0){
                low++;
            }else if(sum > 0){
                high--;
            }else{
                result.add(Arrays.asList(nums[i],nums[low],nums[high]));
                low++;
                high--;
                while(low<high && nums[low]==nums[low-1]){
                    low++;
                }
            }
        }
    }
}
