// Time Complexity : O(n2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : yes, made mistake when updating right pointer(++ instead of --)


// Your code here along with comments explaining your approach

class Solution {
    /** We use a permanent pointer and two other pointers - left and right
     * In each iteration permPointer remains constant while left and right
     * move by one position and we compare sum of triplet with target.
     * If same, we add the triplet to result else we move on.
     * We also have to check for duplicates to avoid calculating the same sum multiple times
     * thus we move forward until we no longer get the same numbers on the left and right pointers **/
    public List<List<Integer>> threeSum(int[] nums) {
        int permanentPointer = 0;
        int left = 0;
        int right = nums.length-1;
        Arrays.sort(nums);
        int sum;
        List<List<Integer>> result = new ArrayList<>();
        while(left<right){
            sum=nums[left]+nums[right]+nums[permanentPointer];
            if(sum==0){
                result.add(new ArrayList(Arrays.asList(nums[left],nums[right],nums[permanentPointer])));
                while(nums[left]==nums[left+1]){
                    left++;
                }
                while(nums[right]==nums[right-1]){
                    right--;
                }

            }
            else if (sum<0) left++;
            else right--;

            permanentPointer++;


        }
        return result;
    }

}