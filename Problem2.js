// Time Complexity : O( n^2) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Wrong way of sorting


var threeSum = function (nums) {
    if (!nums || nums.length < 3) return [];

    nums = nums.sort((a, b) => a - b);
    console.log(nums);
    const result = [];
    for (let i = 0; i < nums.length - 2; i++) {
        if (i > 0 && nums[i] == nums[i - 1]) continue;
        if (nums[i] > 0) break;
        let low = i + 1, high = nums.length - 1;
        while (low < high) {
            let sum = nums[i] + nums[low] + nums[high];
            if (sum == 0) {
                let li = [nums[i], nums[low], nums[high]];
                result.push(li);
                // console.log(result);
                low++;
                high--;
                while (low < high && nums[low] == nums[low - 1]) low++;
                while (low < high && nums[high] == nums[high + 1]) high--;
            } else if (sum < 0) {
                low++;
            } else {
                high--;
            }
        }

    }
    return result;
};