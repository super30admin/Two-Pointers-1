// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function(height) {
  if (height.length < 2 || height === null) return 0;

  var n = height.length;
  var low = 0;
  var high = n - 1;
  var max = 0;

  while (low < high) {
    var width = high - low;
    var minHeight = Math.min(height[low], height[high]);
    max = Math.max(max, minHeight * width);
    if (height[low] < height[high]) {
      low++;
    } else {
      high--;
    }
  }
  return max;
};
