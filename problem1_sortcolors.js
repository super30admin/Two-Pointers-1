//https://leetcode.com/problems/sort-colors/
//// Time Complexity : O(n)
//// Space Complexity : O(1) we are swapping in place
//// Did this code successfully run on Leetcode : yes
//// Any problem you faced while coding this :

// intuition

//// Your code here along with comments explaining your approach

// keep 3 pointers, left, right and current
// left and curr start at element 0, right starts at nums.length-1

// loop through while curr <= right
//   if curr is 0
//     swap curr with left
//     increment both left and curr
//   else if curr is 1
//     increment curr, we are just looking for 0s to swap with left or 2's to swap with right
//   else curr is 2
//     swap curr with right
//     decrement right
var sortColors, swap;

swap = function(nums, i, j) {
  var temp;
  temp = nums[i];
  nums[i] = nums[j];
  return nums[j] = temp;
};

sortColors = function(nums) {
  var curr, left, results, right;
  if (nums === null || nums.length === 0) {
    return [];
  }
  left = 0;
  right = nums.length - 1;
  curr = 0;
  results = [];
  while (curr <= right) {
    if (nums[curr] === 0) {
      swap(nums, curr, left);
      curr += 1;
      results.push(left += 1);
    } else if (nums[curr] === 1) {
      results.push(curr += 1); // it is 2
    } else {
      swap(nums, curr, right);
      results.push(right -= 1);
    }
  }
  return results;
};

//# sourceMappingURL=problem1_sortcolors.js.map
