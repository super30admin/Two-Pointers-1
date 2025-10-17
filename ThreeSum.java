// Time Complexity : O(n^2).
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Approach : The approach is to perform two sum on the rest of the array by fixing one element so that 3 sum can be achieved. We
// consider one element as make sure no duplicates and find the remaining tow elements that make up to 0 in the rest of the array.
// Inside the two sum iteration, we need to eliminate duplicates as well.


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            // skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int l = i + 1; //initialize left
            int r = n - 1; //initialize right

            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[l], nums[r])); //add to the result

                    // skip duplicates for l and r
                    while (l < r && nums[l] == nums[l + 1])
                        l++;
                    while (l < r && nums[r] == nums[r - 1])
                        r--;

                    // move both pointers after recording
                    l++;
                    r--;
                } else if (sum < 0) {
                    l++; // need larger sum so move left pointer to right
                } else {
                    r--; // need smaller sum so move right pointer to left
                }
            }
        }

        return result;
    }
}


Approach 2: Using Hashing
// Time Complexity : O(n^2).
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Approach : The approach is to perform two sum on the rest of the array by fixing one element so that 3 sum can be achieved. The
// two sum is done by using Hashset and searching for the complement.

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            // skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            HashSet<Integer> set = new HashSet<>();
            for(int j=i+1;j<n;j++){
                int complement = -nums[i] - nums[j];
                if(set.contains(complement)){
                    List<Integer> li = Arrays.asList(nums[i], nums[j], complement);
                    Collections.sort(li);
                    result.add(li);

                }else{
                    set.add(nums[j]);
                }
            }


        }

        return new ArrayList<>(result);
    }
}

