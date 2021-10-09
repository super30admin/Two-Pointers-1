// Time Complexity :O(n2logn)
// Space Complexity : O(1) not considering the output array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> output = new ArrayList<>();
    if(nums == null || nums.length < 3) return output;
    //Sorting the array as the order of the result doesn't matter
    Arrays.sort(nums);
    //[-1,0,1,2,-1,-4]
    //The approach is to fix i and finding the two other numbers to make the sum 0
    for(int i = 0; i < nums.length - 2; i++){
        if(i > 0 && nums[i] == nums[i - 1])continue;
        //Two Sum
        int left = i + 1, right = nums.length - 1;
        while(left < right){
            int sum = nums[i] + nums[left] + nums[right];
            if(sum == 0){
                output.add(Arrays.asList(nums[i], nums[left], nums[right]));
                left++;
                right--;
                //Avoid duplicates - if the current value of j is -1 and the next value is also -1
                //it won;t make a difference to our result set, so we skip the calculation and
                //increment j to the next value in the array 
                while(left < right && nums[left] == nums[left - 1])left++;
                while(left < right && nums[right] == nums[right + 1])right--;
            }
            //if the sum is greater than 0, we can decrement the right pointer as going towards it right
            //will only increase the sum
            else if(sum > 0) right--;
            else left++;
        }
    }
    return output;
}