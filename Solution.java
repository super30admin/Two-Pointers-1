import java.util.*;

class Solution {
    // TC: O(n^2) //SC: O(1)
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return list;
        }
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            if (nums[i] > 0) {
                break;
            }
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                // System.out.println("i,j,k" + nums[i] + "-"+ nums[left] + "-" + nums[right]);
                if (sum == 0) {
                    list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while (left < right && (nums[left] == nums[left - 1])) {
                        left++;
                    }
                    while (left < right && (nums[right] == nums[right + 1])) {
                        right--;
                    }
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return list;
    }

    // TC: O(n) //SC: O(1)
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int maxWater = 0;
        while (start < end) {
            int area = (end - start) * Math.min(height[start], height[end]);
            maxWater = Math.max(maxWater, area);
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }
        return maxWater;
    }
}

// TC: O(N) // SC: O(1)
class SortColors {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int left = 0;
        int right = nums.length - 1;
        int mid = 0;

        while (mid <= right) {
            if (nums[mid] == 2) {
                swap(nums, mid, right);
                right--;
            } else if (nums[mid] == 0) {
                swap(nums, mid, left);
                left++;
                mid++;
            } else {
                mid++;
            }
        }
    }

    private void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }

    public static void main(String[] args) {
        SortColors solution = new SortColors();
        int[] colors = { 2, 0, 1, 1, 0, 2 };
        System.out.println("Original Array: " + Arrays.toString(colors));
        solution.sortColors(colors);
        System.out.println("Sorted Array: " + Arrays.toString(colors));
    }
}