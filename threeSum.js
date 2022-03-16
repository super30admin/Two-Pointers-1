// Time Complexity : O(n^2) where n is the length of nums
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

/**
 * @param {number[]} nums
 * @return {number[][]}
 */
//Solving the problem using by two pointer solution
var threeSum = function(nums) {
    let result = [];
    nums =  nums.sort(function(a, b){return a-b});
    for(let i = 0; i<nums.length - 2; i++) {
        //Handling outside duplicacy
        if(i != 0 && nums[i] === nums[i-1]) continue;
        let low=i+1;
        let high=nums.length - 1;
        while(low<high) {
            let total = nums[i] + nums[low] + nums[high];
            if(total === 0) {
                let temp = [nums[i], nums[low], nums[high]];
                result.push(temp);
                low++;
                high--;
                //Handling inside duplicacy
                while(low<high && nums[low] === nums[low - 1]) low++;
                while(low<high && nums[high] === nums[high + 1]) high--;
            }
            else if(total < 0) low++;
            else high--;
        }
    }
    return result;   
};