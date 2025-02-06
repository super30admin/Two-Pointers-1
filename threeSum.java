// Problem2 (https://leetcode.com/problems/3sum/)

// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach in three sentences only
/*
 * Here, two pointer approach is used for elements other than element at an index in the array. For an element at index i, two pointer approach
 * is used for array from indices i+1 to n-1, left pointer is i+1 and right is n-1. if elements sum at ith position and left and right is 0
 * then we add those elements to list and increase left pointer and decrease right pointer. If increased left pointer is same as its previous
 * then again increase left pointer. If increased right pointer is same as its previous then again increase right pointer. Else if sum is 
 * greater than 0 decrease right pointer else increase left pointer. Finally, return list.
 */

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length <3) return new ArrayList();
        List<List<Integer>> list = new ArrayList();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0;i<n-2;i++){
            if(nums[i]>0 ) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i+1;
            int r = n-1;
            while(l<r){
                int sum = nums[i]+nums[l]+nums[r];
                if(sum==0){
                    list.add(new ArrayList<>(List.of(nums[i], nums[l], nums[r])));
                    l++;
                    r--;
                    while(l<r && nums[l] == nums[l-1]){
                        l++;
                    }
                    while(l<r && nums[r] == nums[r+1] ){
                        r--;
                    }
                 } 
                else if(sum>0){
                    r--;
                }
                else{
                    l++;
                }
            }
        }
        return list;
    }
}