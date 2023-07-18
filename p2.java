// Time Complexity : O(n*n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        // Sorting the array in the beginning
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        // Itearting through all the elements till we reach an element greater than 0 as
        // finding solution for element greater than 0 would not be possible

        for (int ind = 0; ind < nums.length - 1 && nums[ind] <= 0; ind++) {

            // Hashset for maintaining all the unique elements
            Set<Integer> set = new HashSet<>();
            // Iterating through the elements
            for (int i = ind + 1; i < nums.length; i++) {

                // Finding the element where all the three elements combined would result to 0
                int temp = 0 - nums[ind] - nums[i];

                // Adding the 3 elements
                if (set.contains(temp)) {
                    List<Integer> triplets = new ArrayList<>();
                    triplets.add(nums[ind]);
                    triplets.add(nums[i]);
                    triplets.add(temp);
                    result.add(triplets);
                    // To remove duplicates
                    while (i < nums.length - 1 && nums[i] == nums[i + 1])
                        i++;
                } else {
                    set.add(nums[i]);
                }

            }

            // To remove duplicated
            while (ind < nums.length - 1 && nums[ind] <= 0 && nums[ind] == nums[ind + 1])
                ind++;
        }

        return result;
    }

}