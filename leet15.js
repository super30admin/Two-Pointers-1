// Time Complexity : O(N^2)
// Space Complexity : O(nlogn)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function(nums) {
    nums.sort((a , b) => a - b );
    let res = [];
    for(let i = 0; i < nums.length - 1; i++) {
        if(nums[i] > 0) return res;
        if(i > 0 && nums[i] === nums[i - 1]) continue; //remove duplicated
        let left = i + 1;
        let right = nums.length - 1;
        while(left < right) {
            if(nums[i] + nums[left] + nums[right] === 0) {
                res.push([nums[i], nums[left],nums[right]])
                while(right > left && nums[left] === nums[left + 1]) left++; 
                while(right > left && nums[right] === nums[right - 1]) right--; 
                left++;
                right--;
            } else if(nums[i] + nums[left] + nums[right] < 0) {
                left++;
            } else {
                right--;
            }
            
        }
    }
    return res;
};
