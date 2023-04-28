// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach


## Problem1 (https://leetcode.com/problems/sort-colors/)

// Time Complexity : 0(n) because the solution uses a single pass over the input array, and each element is processed exactly once.
// Space Complexity : 0(1) because the solution only uses a constant amount of extra space regardless of the size of the input array.

class Solution {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;

        while (mid <= high) {
            if (nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            }
            else if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            }
            else {
                mid++;
            }
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}




## Problem2 (https://leetcode.com/problems/3sum/)

// Time Complexity - 0(n^2) because the code uses nested loops to traverse the input array. The outer loop runs n - 2 times, 
//                   and the inner loop runs n - 2 times in the worst case
// Space Complexity - 0(1) The code uses a constant amount of extra space to store the variables like "result", "left", "right", and "sum"

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(nums);
    int n = nums.length;
    for (int i = 0; i < n - 2; i++) {
        if (nums[i] > 0) {
            break;
        }
        if (i > 0 && nums[i] == nums[i - 1]) {
            continue;
        }
        int left = i + 1;
        int right = n - 1;
        while (left < right) {
            int sum = nums[i] + nums[left] + nums[right];
            if (sum < 0) {
                left++;
            } else if (sum > 0) {
                right--;
            } else {
                result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                left++;
                while (left < right && nums[left] == nums[left - 1]) {
                    left++;
                }
                right--;
                while (left < right && nums[right] == nums[right + 1]) {
                    right--;
                }
            }
        }
    }
    return result;
}
}



## Problem3 (https://leetcode.com/problems/container-with-most-water/)

// Time Complexity - 0(n) because the code loops through the entire input array only once, so the time complexity is linear in the size of the input array
// Space Complexity - 0(1) The code uses only a constant amount of extra space to store the variables like "maxArea", "left", and "right".

class Solution {
    public int maxArea(int[] height) {
    int maxArea = 0;
    int left = 0;
    int right = height.length - 1;
    while (left < right) {
        int area = Math.min(height[left], height[right]) * (right - left);
        maxArea = Math.max(maxArea, area);
        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }
    return maxArea;
    }
}