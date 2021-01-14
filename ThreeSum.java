// Time Complexity : O(n^2 logn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Notes : In the sorted array, for 2 numbers in the array, find the 3rd number by performing a binary search on the rest of the array.

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length <=2) return result;
        
        Arrays.sort(nums);
              
        for(int i=0; i<nums.length-2; i++) {
            if(i>0 && nums[i] == nums[i-1]) continue;
            for(int j=i+1; j<nums.length; j++) {
                if(j>i+1 && nums[j] == nums[j-1]) continue;

                int remaining = 0 - (nums[i] + nums[j]);

                boolean isPresent = binarySearch(nums,remaining,j+1,nums.length-1);

                if(isPresent){
                    List<Integer> list = new ArrayList<Integer>(Arrays.asList(nums[i], nums[j], remaining));
                    result.add(list);
                }
            }
        } 
        return result;
    }
    
    private boolean binarySearch(int[] nums, int target, int low, int high ){
        while(low <= high){
            int mid = low + (high - low)/2;

            if(nums[mid] == target){
                return true;
            } else if(target < nums[mid]){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}
