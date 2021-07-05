// ## Problem2 
// (https://leetcode.com/problems/3sum/)

// Time Complexity : O(n2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

const threeSum = function(nums) {
    if(!nums || nums.length < 3) return [];
    nums = nums.sort((a,b) => a-b);
    let res = [];
    for(let i = 0; i<nums.length - 2; i++) {
        if(i > 0 && nums[i] === nums[i-1]) continue;
        let left = i+1, rigth = nums.length - 1;
        while(left < rigth) {
            let sum = nums[i] + nums[left] + nums[rigth];
            if(sum === 0) {
                res.push([nums[i], nums[left], nums[rigth]]);
                left--;
                rigth--;
                while(nums[left] === nums[left - 1]) left++;
                while(nums[rigth] === nums[rigth + 1]) rigth--;
            }
            else if(sum < 0) left++;
            else rigth--;
        }
    }
    return res;
};