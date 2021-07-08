// Time Complexity : O(n^2) where n is the number of elements in the array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Many approaches
/* Your code here along with comments explaining your approach: Sort the Array. Take the first element and take the subarray from the next element
till the end. Hence low becomes (i+1)th and high becomes the end. Calculate the sum using nums[i], nums[low]., nums[high]. If the sum is less than 0
move the low to the right and if sum > 0 move the high to left to balance the sum to 0. If sum is 0, store the list. Increment both, the low and 
the high pointer but ensure that they dont have duplicates. This can be checked on comparing the ith position with the next and previous positions
so that we dont land up on a duplicate sum and the duplicate list insertion can be avoided.
*/
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length==0 || nums== null){return result;}
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length; i++){
            int low = i+1, high = nums.length-1;                        // the subarray would be from i+1th till the end
            if(i>0 && nums[i]== nums[i-1]){continue;}
            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];                     // Sum calculation
                if(sum == 0){
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));          // List found
                    low++;high--;
                    while(low < high && nums[low]==nums[low-1])low++;               // Preventing internal duplicates
                    while(low < high && nums[high] == nums[high+1])high--;          // preventing internal duplicates while checking next positions
                } else 
                if(sum < 0){                                                            // If sum is towards negative, move right to balance it to 0
                    low++;
                } else {
                    high--;
                }
            }
        }
        return result;
    }
}