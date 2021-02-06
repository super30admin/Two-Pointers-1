class Solution {
    /*
    Time Complexity: O(n^2)
    Space Complexity: O(1)
    */
    public List<List<Integer>> threeSum(int[] nums) {
        // check if the nums array is empty or not
        if (nums == null || nums.length < 3){
            return new ArrayList<>();
        }
        // sort the array
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        
        // traverse the array
        for(int i = 0; i <= n - 2; i++){
            // skip the same number as it will give the same set of output
            if (i != 0 && nums[i-1] == nums[i]){
                continue;
            }
            // initialize j and k
            int j = i + 1;
            int k = n - 1;
            // 
            while(j < k){
                // sum of the elements at i, j, and k
                int sum = nums[i] + nums[j] + nums[k];
                // if sum is 0 then
                if (sum == 0){
                    // add the arrayList to res
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    // increment i and decrement j as we do not want repetitive elements
                    j += 1;
                    k -= 1;
                    // check if a repetitive element is present while iterating i and j
                    while(j < k && nums[j - 1] == nums[j]){
                        j += 1;
                    }
                    while(j < k && nums[k + 1] == nums[k]){
                        k -= 1;
                    }
                }
                // if the sum is less than 0
                else if (sum < 0){
                    // increment i to move to the next element as the greater elements will be on the right side of the array
                    j += 1;
                    // check for repetitive elements to avoid duplicates in res
                    while(j < k && nums[j - 1] == nums[j]){
                        j += 1;
                    }
                }
                // if the sum > 0 then
                else{
                    // decrement j to move to the prev element as the lesser elements will be on the left side of the array
                    k -= 1;
                    // check for repetitive elements to avoid duplicates in res
                    while(j < k && nums[k+1] == nums[k]){
                        k -= 1;
                    }
                }
            }
        }
        // return the result
        return res;
    }
}