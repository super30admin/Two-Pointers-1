// Time Complexity : O(n^2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
/**
 * Approaches : Try all combinations(n^3), HashMap(n^2), Binary Search(n^2logn), 2 ptrs(n^2)
 */

// Your code here along with comments explaining your approach

/**
 * Traverse through all the numbers in the given array, for each number, check using 2 ptrs if there is any combination which match my target.
 */
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length == 0)
            return new ArrayList<>(0);
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        Arrays.sort(nums);                     //nlogn ---sort the values to use 2 ptrs to find the 2 sum which match my 3rd numer

        for(int i=0;i<nums.length-2;i++){
            int target = -nums[i];            //1st val
            int l=i+1,h=nums.length-1;
            while(l<h){                       //find 2 sum which match my target val
                if((nums[l]+nums[h])==target){
                    res.add(new ArrayList<>(Arrays.asList(-target,nums[l],nums[h])));
                    l++; h--;
                    while(l<h && nums[l] == nums[l-1]) l++;
                    while(l<h && nums[h] == nums[h+1]) h--;
                }else if(nums[l]+nums[h] < target) {
                    l++;
                    while(l<h && nums[l] == nums[l-1]) l++;
                }else
                {
                    h--;
                    while(l<h && nums[h] == nums[h+1]) h--;
                }
            }
            while(i<nums.length-1 && nums[i+1] == nums[i]) i++;
        }

        return res;
    }
}