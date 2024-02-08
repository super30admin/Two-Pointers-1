class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i =0; i<nums.length;i++) {
            if(i != 0 && nums[i] == nums[i-1]) {
                continue;
            }
            if(nums[i] > 0) {
                break;
            }
            int value = 0-nums[i];
            int low = i+1;
            int high = nums.length-1;
            while(low < high) {
            if(nums[low]+nums[high] == value) {
               result.add(Arrays.asList(nums[i], nums[low],nums[high]));
               low++;
               while(low < high && nums[low] == nums[low-1]) {
                   low++;
               }
               high--;
               while(low < high && nums[high] == nums[high+1]) {
                   high--;
               }
            } else if(nums[low]+nums[high] < value) {
                low++;
            } else {
                high--;
            }
            
            }
        }
        return result;
    }
}