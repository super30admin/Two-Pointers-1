// Time Complexity : O(n log(n)) + O(n^2) --> O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * Sort the array. Use hashset inside 1 iteration. Inside 2nd for loop, find the complement using i and j. Check if the complement is in hashset. If yes, add nums[i], nums[j] &
 * complement as the triplet to the result. In the end, add nums[j] to the hashset to store the previous numbers and find it later in O(1) time.
 */

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0; i<nums.length; i++) {
            if(i == 0 || nums[i] != nums[i-1]) {
                twoSum(nums, i, result);
            }
        }
        return result;
    }

    private void twoSum(int[] nums, int i, List<List<Integer>> result) {

        Set<Integer> set = new HashSet<>();

        for(int j=i+1; j<nums.length; j++) {
            int complement = -nums[i]-nums[j];
            if(set.contains(complement)) {
                result.add(Arrays.asList(nums[i], nums[j], complement));
                while(j+1 < nums.length && nums[j] == nums[j+1])
                    j++;
            }
            set.add(nums[j]);
        }
    }
}


/**
 * Sort the array. Use 2 pointers inside 1 iteration. Add the current index and 2 pointers. If the sum<0, increment low. If sum>0, decrement high. if sum=0, add the triplet to
 * the list.
 */

/*class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);                                  //O(n log(n))
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0; i<nums.length; i++) {                  //O(n)
            if(i == 0 || nums[i] != nums[i-1]) {
                twoSum(nums, i, result);
            }
        }
        return result;
    }

    private void twoSum(int[] nums, int i, List<List<Integer>> result) {

        int low = i+1, high = nums.length-1;

        while(low < high) {                                 //O(n)
            int sum = nums[i] + nums[low] + nums[high];

            if(sum == 0) {
                result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                low++;
                high--;
                while(low < high && nums[low] == nums[low-1])
                    low++;
            }
            else if(sum < 0)
                low++;
            else
                high--;
        }
    }
}*/

