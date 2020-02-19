// Time Complexity : O(N^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Brute force is to iterate through 3 for loops, to find all possible combinations, then use hashset to avoid duplicates O(N^3)
/*
1. Use basic logic that if a+b+c == 0, a+b = -c. Sort the array first
2. So, initialize sum to 1st element's negative and check if other two elements' sum is equal to it
3. If less than it, increment low pointer
4. If more than it, decrement high pointer
*/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if(nums == null || nums.length == 0) return result;

        //sort array 
        Arrays.sort(nums);

        for(int i = 0; i < nums.length-2; i++) { // Iterate i from 0 to n-2
            if(i == 0 || (nums[i] != nums[i-1])) { // prevent exception by checking bounds
                int lo = i+1, hi = nums.length-1,sum = -nums[i]; // a+b+c == 0 check is same as a+b == -c, so 2 sum problem now
                if(nums[i] > 0 || nums[hi] < 0) break; // break if nums[i] > 0 or nums[high] < 0, because all +ve or -ve cannot 
                while(lo < hi) { //iterate from lo to hi to check if sum exists
                    if(nums[lo]+nums[hi] == sum) {
                        result.add(Arrays.asList(nums[i],nums[lo],nums[hi])); // add matching 3sum
                        while (lo < hi && nums[lo] == nums[lo+1]) lo++; // avoid duplicates
                        while (lo < hi && nums[hi] == nums[hi-1]) hi--; // avoid duplicates
                        lo++;
                        hi--;
                    }
                    else if(nums[lo]+nums[hi] < sum) lo++; //because sorted, increment lo if less than sum
                    else hi--; //decrement hi if greater than sum
                }
            }
        }
        return result;
    }
}