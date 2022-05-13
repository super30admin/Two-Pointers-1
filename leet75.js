// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var sortColors = function(nums) {
   
    var left = 0,right = nums.length-1;
    var mid = 0;
    while(mid<=right)
    {
        if(nums[mid]===2)
        {  swap(nums,mid,right);
           right--;
        }
        else if(nums[mid]===0)
        {  
           swap(nums,mid,left);
           left++;
           mid++;
        }
        else if(nums[mid]===1)
        {
            mid++;
        }
    }
    function swap(nums,r,c)
    {
        var temp= nums[r];
        nums[r] = nums[c];
        nums[c] = temp;
    }
};
