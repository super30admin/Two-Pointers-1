//Three Sum (LC 15)
// Time Complexity : O(n^2)
// Space Complexity : O(log n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Figuring out I needed to add mid as a third pointer


// I tried two pointers but had to add a third pointer to make this approach work

/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function(nums) {
    let result = [];
    if(nums.length === 0 || nums === null){
        return result;
    }
    nums = nums.sort((a,b)=>{return a-b});
    let n = nums.length;
    for(let i=0;i<n;i++){
        if(nums[i] === nums[i-1]){
            continue;
        }
        if(nums[i] > 0){
            break;
        }
        let low = i+1;
        let high = n-1;
        while(low < high){
            let sum = nums[i]+nums[low]+nums[high];
            if(sum === 0){
                result.push([nums[i],nums[low],nums[high]]);
                low++;
                high--;
                while(nums[low] === nums[low-1]){
                    low++;
                }
                while(nums[high] === nums[high+1]){
                    high--;
                }
            } else if(sum > 0){
                high--;
            } else {
                low++;
            }
        }
    }
    return result;
};