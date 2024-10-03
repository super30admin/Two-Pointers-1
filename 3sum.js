/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function(nums) {
    if (nums.length < 3) return [];
    nums.sort((a,b) => a-b);
    let res = [];

    for(let i = 0;i < nums.length && nums[i] <= 0; i++){ //If the current value is greater than zero, break from the loop. Remaining values cannot sum to zero.
        if(i === 0 || nums[i -1] !== nums[i]){ //If the current value is the same as the one before, skip it.
            if (nums[i] > 0) break; 
            twoSum(nums, i, res);
        }
    }
    return res;
};

let twoSum = function(nums, i, res) {
    let lo = i + 1, hi = nums.length -1;
    while(lo < hi) {
        let sum = nums[i] + nums[lo] + nums[hi];
        if(sum < 0) {
            ++lo;
        }
        else if(sum > 0) {
            --hi;
        }
        else {
            res.push([nums[i], nums[lo++], nums[hi--]]);
            while(lo < hi && nums[lo] === nums[lo - 1]) ++lo;
        }
    }
};