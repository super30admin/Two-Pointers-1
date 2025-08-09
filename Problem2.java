
// Time Complexity :O(n^2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// We will use a two-pointer approach to find the triplets. First, we sort the array
// Then, we fix one element and use two pointers to find the other two elements
//if we find the sum as zero increment both the pointers if it is less than zero increment the 
// left pointer else decrement the right pointer

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for (int i=0;i<nums.length-2;i++) {
            if (i>0&&nums[i]==nums[i-1])   // Skip duplicates
                continue;

            int j=i+1;
            int k=nums.length-1;

            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));

                    while (j<k&&nums[j]==nums[j+1])    // Skip duplicates
                        j++;

                    while (j<k&&nums[k]==nums[k-1])    // Skip duplicates
                        k--;

                    j++;
                    k--;
                }
                else if (sum < 0) 
                    j++;
                else 
                    k--;
            }
        }
        return ans;
    }
}