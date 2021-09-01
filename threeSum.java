// Time Complexity: O(n^2)+O(nlog(n)) as on sorted array for each element we continue to shrink and search to identfy if sum of 2 elements is same as 0-current element.
// Space Complexity: No additional data structure used O(1)
// Did you complete is on leetcode: Yes
// Any problems faced: could not come uo with idea myself

// Write your approach here:
// Idea is to use 2 pointers for each element. We make 0- element a target to be achieved by summation of 2 elements in rest of the array.
// to reduce number of comparisons, we are moving 1 pointer from left and if it is duplicate
// we keep moving left pointer
// similarly if we get duplicate from right pointer we srinking towards left
// performing summation of left and right and comparing with current target gives us of which elements should be added to list.
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            if(i>0 && nums[i]==nums[i-1]) {
                continue;
            }
            int target = 0-nums[i];
            int l = i+1;
            int h = nums.length-1;
            while(l<h){
                if(l!=i+1 && nums[l]==nums[l-1]) {
                    ++l;
                    continue;
                } else if(h!=nums.length-1 && nums[h]==nums[h+1]) {
                    --h;
                    continue;
                }
                int tempSum = nums[l]+nums[h];
                if(tempSum==target) {
                    result.add(Arrays.asList(nums[i], nums[l], nums[h]));
                    ++l;
                    --h;
                } else if(tempSum<target) {
                    ++l;
                    continue;
                } else {
                    --h;
                    continue;
                }
            }
        }
        return result;
    }
}