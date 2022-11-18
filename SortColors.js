// Time Complexity : O (n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var sortColors = function(nums) {
  if (nums.length === 0 || nums === null) return;

  var n = nums.length;
  var low = 0;
  var mid = 0;
  var high = n - 1;
  var swap = function(i, j) {
    var temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  };

  while (mid <= high) {
    if (nums[mid] === 2) {
      // swap mid element with high
      swap(mid, high);
      high--;
    } else if (nums[mid] === 0) {
      // swap mid element with low
      swap(mid, low);
      low++;
      mid++;
    } else {
      mid++;
    }
  }
};
