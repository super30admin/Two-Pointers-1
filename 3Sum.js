// Time Complexity : O (n)^2
// Space Complexity : O (1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes, Sorting numbers in javascript. Compare function is used to resolve the same

/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function(nums) {
  if (nums.length < 3 || nums === null) return [];

  //Sorting the input array to perform two pointers

  var compare = function(a, b) {
    return a - b;
  };
  nums.sort(compare);

  var n = nums.length;
  var result = new Array();

  for (var i = 0; i < n; i++) {
    if (nums[i] > 0) break;
    if (i > 0 && nums[i] === nums[i - 1]) continue;
    var low = i + 1;
    var high = n - 1;
    while (low < high) {
      var sum = nums[i] + nums[low] + nums[high];
      if (sum === 0) {
        // console.log(nums[i], nums[low], nums[high])
        result.push([nums[i], nums[low], nums[high]]);
        low++;
        high--;
        while (low < high && nums[low] === nums[low - 1]) {
          low++;
        }
        while (low < high && nums[high] === nums[high + 1]) {
          high--;
        }
      } else if (sum < 0) {
        low++;
      } else {
        high--;
      }
    }
  }

  return result;
};
