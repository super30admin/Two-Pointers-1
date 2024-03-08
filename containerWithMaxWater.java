//time: O(N) where N is the no of elements
//space: O(1)
//approach: Two pointers

class Solution {
    public int maxArea(int[] nums) {
        int left = 0;
        int n = nums.length;
        int right = n -1;
        int area = 0;
        while(left < right) {
            area = Math.max(area, Math.min(nums[left], nums[right]) * Math.abs((right - left)));
            if(nums[left] < nums[right]) {
                left++;
            } else if(nums[left] > nums[right]) {
                right--;
            } else {
                left++; right--;
            }
        }
        return area;
    }
}
