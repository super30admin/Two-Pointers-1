// Time Complexity : O(n2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

/*
 Sort the array first.
 Apply two sum for each element -> i+1 to n
 instead of sorting list in hashset, just loop forward when you find duplicates
 */

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>(); 
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0 ;i<n-1 ;i++) {
            if(nums[i] > 0) break;
            if(i>0 && nums[i] == nums[i-1]) continue;

            int l=i+1;
            int r = n-1;
            while(l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    while(l<r && nums[l] == nums[l-1]) {
                        l++;
                    }
                    while(l<r && nums[r] == nums[r+1]) {
                        r--;
                    }
                } else if(sum > 0) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        return res;
    }
}