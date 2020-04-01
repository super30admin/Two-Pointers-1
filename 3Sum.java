// Time COmplexity: O(n^2)
// Space Complexity: O(1) if resultant list is not considered to occupy space
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0; i<nums.length-2; i++) {
            if(i==0 || (i>0 && nums[i]!=nums[i-1])) {
                int left = i+1, right = nums.length-1, sum= 0 -nums[i];
                while(left<right) {
                    int cur = nums[left]+nums[right];
                    if(cur==sum) {
                        res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while(left<right && (nums[left]==nums[left+1])) left++;
                        while(left<right  && (nums[right]==nums[right-1])) right--;
                        left++;
                        right--;
                    } else if(cur>sum) {
                        right--;
                    } else {
                        left++;
                    }

                }
            }
        }

        return res;
    }
}