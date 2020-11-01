// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this: No


var threeSum = function(nums) {
    let resultArr = [];
    const sortedArr = nums.sort((a, b) => a - b);
    for (i = 0; i < sortedArr.length - 2; i++) {
      if (sortedArr[i] > 0) {
        break;
      }
      if (i > 0 && sortedArr[i] === sortedArr[i - 1]) {
        continue;
      }
      let left = i + 1;
      let right = sortedArr.length - 1;
      while (left < right) {
        const sum = sortedArr[i] + sortedArr[left] + sortedArr[right];
        if (sum < 0) {
          left++;
        } else if (sum > 0) {
          right--;
        } else {
          resultArr.push([sortedArr[i], sortedArr[left], sortedArr[right]]);
          while(left < right && sortedArr[left] === sortedArr[left + 1]) {
            left++;
          }
          while(left < right && sortedArr[right] === sortedArr[right - 1]) {
            right--;
          }
          left++;
          right--;  
        }
      }
    }
    return resultArr;
};