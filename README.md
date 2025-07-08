# Two-Pointers-1

## Problem1 (https://leetcode.com/problems/sort-colors/)
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
1. We will use Dutch-National Flag algo in which 0 represents red, 1 represents white and 2 represents blue
2. We will have 3 pointers low = 0(red), mid = 0(white), high = nums.length-1(blue)
3. We will compare the current value at mid if its 0 then we will swap low and mid and the do loww ++ or if its 2 we will swap mid and high and do high-- and if its 1 itself then we will just do mid++
class Solution {
    public void sortColors(int[] nums) {
        if (nums.length <= 1) return;
        
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } 
            else if (nums[mid] == 1) {
                mid++;
            }
            else {
                swap(nums, mid, high);
                high--;
            }
        }
    }

    public void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}

## Problem2 (https://leetcode.com/problems/3sum/)
// Time Complexity : O(n*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
1. We will run a loop from 0 to n-1 and an inner loop from i to n-1 where none of these 3 pointers should be on the same index 
2. If we find sum == 0 then we add those 3 elements to our result list or if its <than 0 then we do left++ and if its >than 0 we do right --
3. When the sum was 0 we will try to find different pairs with the element on the i index but we will make sure that both left and right pointers represnt a new value hence, that is why we run a while loop


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums == null || nums.length < 3) {
            return result;
        }

        Arrays.sort(nums); 

        for (int i = 0; i < nums.length - 2; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue; // Skip duplicates
            }

            if (nums[i] > 0) {
                break; // Since array is sorted, no point in continuing
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    // Skip duplicates
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } 

                else if (sum < 0) {
                    left++; // Need a larger number
                } 

                else {
                    right--; // Need a smaller number
                }
            }
        }

        return result;
    }
}

## Problem3 (https://leetcode.com/problems/container-with-most-water/)
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
1. The Area formula is width * height  and we will compromise with the widht to get a longer height
2. We calculate the are by finding min bw the values of left and right pointers * the dis bw them
3. We will do left++ if the left element is smaller than right element and right -- if right is smaller than left

class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length < 2){
            return 0;
        }

        int right = height.length - 1;
        int area = 0;
        int left = 0;

        while(left < right){

            int min = Math.min(height[left], height[right]);
            
            area = Math.max((right - left) * min, area);

            while(left < right && height[left] <= min){
                left++;
            }

            while(left < right && height[right] <= min){
                right--;
            }
        }
        
        return area;
    }
}