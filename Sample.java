// Problem1 - Sort Colors
// Time Complexity : O(n) where n = array length
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// Algorithm
// 1 - initiliaze pointers
// 2 - if encountered 0, swap with left
// 3 - if encountered 2, swap with right
// 4 - else just increase the current pointer
class Solution {
  public void sortColors(int[] nums) {
    if (nums == null || nums.length <= 1) {
      return;
    }
    
    // 1
    int left = 0;
    int pointer = 0;
    int right = nums.length - 1;
    while (pointer <= right) {
      // 2
      if (nums[pointer] == 0) {
        swap(nums, pointer, left);
        left += 1;
        pointer += 1;                
      } else if (nums[pointer] == 2) { // 3
        swap(nums, pointer, right);
        right -= 1;
      } else { // 4
        pointer += 1;
      }
    }
  }

  private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
}

// Problem2 - 3Sum
// Time Complexity : O(n x n x logn) where n = array length
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// Algorithm
// 1 - sort the array
// 2 - loop over array
// 3 - check for same element
// 4 - initiliaze left and right pointers
// 5 - while condition
// 6 - check for sum 3 and keep incrementing left and decrementing right if encountered same values
// 7 - else if sum less than 0, increment left
// 8 - else decrement right
class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    if (nums == null || nums.length == 0) {
      return new ArrayList<>();
    }

    List<List<Integer>> result = new ArrayList<>();
    // 1
    Arrays.sort(nums);
    // 2
    for (int i = 0; i < nums.length - 2; i++){
      // 3
      if (i == 0 || (i > 0 && nums[i] != nums[i - 1])){
        // 4
        int left = i + 1;
        int right = nums.length - 1;
        
        // 5
        while(left < right){
          // 6
          if (nums[left] + nums[right] + nums[i] == 0){
            result.add(Arrays.asList(nums[i], nums[left], nums[right]));
            while (left < right && nums[left] == nums[left + 1]) {
              left++;
            }
            while (left < right && nums[right] == nums[right - 1]) {
              right--;
            }
            left ++;
            right --;
          } else if (nums[i] + nums[left] + nums[right] < 0) { // 7
            left++;
          }
          else { // 8
            right--;
          }
        }
      }
    }

    return result;
  }
}

// Problem3 - Container With Most Water
// Time Complexity : O(n) where n = array length
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// Algorithm
// 1 - initiliaze pointers
// 2 - while condition
// 3 - get min length
// 4 - calculate area
// 5 - get max
// 6 - if left is smaller, increment else decrement right
class Solution {
  public int maxArea(int[] height) {
    if (height == null || height.length == 0) {
        return 0;
    }
    // 1
    int left = 0;
    int right = height.length - 1;
    int max = Integer.MIN_VALUE;
    // 2
    while (left < right) {
      // 3
      int minLen = Math.min(height[left], height[right]);
      // 4
      int area = minLen * (right - left);
      // 5
      max = Math.max(max, area);
      
      // 6
      if (height[left] < height[right]) {
        left += 1;
      } else {
        right -= 1;
      }
    }

    return max;
  }
}
