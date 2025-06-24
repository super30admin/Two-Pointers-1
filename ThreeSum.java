// Time Complexity : O(n^2) — We sort the array (O(n log n)) and for each element, use a two-pointer approach (O(n))
// Space Complexity : O(1) — No extra space used apart from the result list (ignoring the output space)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach:
// Two-pointer approach after sorting.
// For each element in the sorted array, use two pointers (low and high) to find pairs that sum up to the negative of that element.
// Skip duplicates to avoid repeating the same triplet.


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //Sort the array
        Arrays.sort(nums);

        //size of nums
        int n = nums.length;
        //Stores result
        List<List<Integer>> result = new ArrayList<>();


        //Loop through the array
        for(int i=0; i<n; i++){
            //Avoid duplicated
            if(i!=0 && nums[i] == nums[i-1]) continue;
            //If number is greater than 0 we dont not have to check further
            if(nums[i] > 0) break;
            int low = i+1;
            int high = n-1;
            //loop through the other elements as 2sum with the target
            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0){
                    //Create the list of triplet and add it to the rsult
                    result.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    //Increment the low and high pointer
                    low++;
                    high--;
                    //check for duplicates
                    while(low<high && nums[low] == nums[low-1])low++;
                    while(low<high && nums[high] == nums[high+1])high--;
                }else if(sum < 0){
                    low++;
                }else{
                    high--;
                }
            }
        }

        //Return result
        return result;
    }
}