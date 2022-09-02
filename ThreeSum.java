// Time complexity: O(n^2)
// Space complexity: O(1)

// Approach: we iterate through each element of nums and perform a two sum using two pointers between the element plus one and last element of the array. We calculate the sum of the element, the element at low pointer and element at high pointer and if the sum is 0, we add that triplet to the result.

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length-2; i++) {
            // to avoid loop duplicacy. basically we will just continue if it is the same element
            if (i > 0 && nums[i] == nums[i-1]) continue;
            int low = i+1; int high = nums.length-1;
            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if (sum == 0) {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[low]);
                    list.add(nums[high]);
                    result.add(list);
                    low++; high--;
                    // to avoid inner duplicate
                    while (low < high && nums[low] == nums[low-1]) low++;
                    while (low < high && nums[high] == nums[high+1]) high--;
                }
                else if (sum > 0) {
                    high--;
                }
                else {
                    low++;
                }
            }
        }
        
        return result;
    }
}