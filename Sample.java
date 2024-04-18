// Problem 1: (https://leetcode.com/problems/sort-colors/)
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach : It uses three pointers (low, mid, and high) to partition the array into three sections: 0s on the left, 1s in the middle, and 2s on the right. It iterates through the array, swapping elements to move 0s to the left and 2s to the right, while keeping 1s in the middle.

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0, mid = 0, high = n - 1;
        while (mid <= high) {
            if (nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            } else if (nums[mid] == 0) {
                swap(nums, mid, low);
                low++;
                mid++;
            } else {
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

// Problem 2: (https://leetcode.com/problems/3sum/)
// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach : It first sorts
// the array, then iterates through each element nums[i] and uses two pointers
// (low and high) to find the remaining two elements such that their sum is
// zero. It skips duplicate elements to avoid duplicate triplets in the result.
// The triplets are added to the result list, and the final list of triplets is
// returned.

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n - 2; i++) {
            int low = i + 1, high = n - 1;
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            if (nums[i] > 0) {
                break;
            }
            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;
                    while (low < high && nums[low] == nums[low - 1]) {
                        low++;
                    }
                    while (low < high && nums[high] == nums[high + 1]) {
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
    }
}

// Problem 3: (https://leetcode.com/problems/container-with-most-water/)
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach : Two pointer
// approach is used to solve this problem. We start with two pointers low and
// high at the start and end of the array. We calculate the area between the two
// pointers and store the maximum area. We then move the pointer with the
// smaller height to the next element and repeat the process until the two
// pointers meet. The maximum area is returned as the result.

class Solution {
    public int maxArea(int[] height) {

        int n = height.length;
        int result = 0;
        int start = 0, end = 0;
        int low = 0, high = n - 1;

        while (low < high) {
            int width = high - low;
            int curAr = 0;
            if (height[low] < height[high]) {
                curAr = width * height[low];
                if (curAr > result) {
                    result = curAr;
                    start = low;
                    end = high;
                }
                low++;
            } else {
                curAr = width * height[high];
                if (curAr > result) {
                    result = curAr;
                    start = low;
                    end = high;
                }
                high--;
            }
        }
        System.out.println(start + " " + end);
        return result;
    }
}