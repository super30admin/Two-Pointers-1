// Time Complexity : O(n) as we will traverse through all the elements in the array and swap it
// Space Complexity : O(1) as we are doing in-place swapping.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Nope followed the approach discussed in the class

// Your code here along with comments explaining your approach
// Main logic here is we are going to keep all 0s in the left all 2s in the right and all 1s in the middle. First we will keep middle and left pointers at the start
// of the array and the right pointer at the last element. If the current element is 1 then we will keep on increasing mid index. If the middle element is 
// equal to zero we will swap it with left element to keep all 0s in the left and increase the middle and left pointers. Then we will check if the middle 
// element is 2 then if it is 2 then we will swap it with right element to keep all 2s in the right section of the array and then we will decrease the right index.
class Solution {
    public void sortColors(int[] nums) {

        int n = nums.length;
        
        if(nums == null || nums.length == 0) return;

        int l = 0;
        int mid = 0;
        int r = n - 1;

        while(mid <= r) {
            if(nums[mid] == 0) {
                swap(nums, mid, l);
                l++;
                mid++;
            } else if(nums[mid] == 2) {
                swap(nums, mid, r);
                r--;
            } else {
                mid++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        if(i != j) {
            nums[i] = nums[i] + nums[j];
            nums[j] = nums[i] - nums[j];
            nums[i] = nums[i] - nums[j];
        }
    }
}



// Time Complexity : O(n^2) as we will keep one pointer fixed and move other 2 simultaneously.
// Space Complexity : O(1) as we are not using any extra space other than input and output.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Nope followed the approach discussed in the class

// Your code here along with comments explaining your approach
// The main idea to solve this problem is to keep one pointer fixed and we will move other two pointers throughout the array to get the desired results. First we 
// need to sort the array and then we will iterate through the array. we will keep the the left pointer on the second element of an array and right pointer on 
// the last element of an array. Then we will add these elements and check if the sub is 0, if it is then we will add it in the output list and increase the left
// pointer and decrease the right pointer. We will keep on increasing the left pointer until we find new element and we will decrease right element until we 
// find new element. If the sum is greater than 0 that means we need smaller element in the sum so we will decrease right pointer and if the sum is less than 0
// that means we need bigger element in the sum so we will increase left pointer. At the end we will return result List.
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        // Arrays.sort(nums, (a, b) -> a-b); ascending order [1, 2, 3, 4]
        // Arrays.sort(nums, (a, b) -> b-a); descending order [4, 3, 2, 1]
        // Arrays.sort(nums, (a, b) -> if(a < b) retunr {true;} else if(b > a){76;} else {return 0;});
        Arrays.sort(nums);

        for(int i = 0; i < n-2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            int l = i+1;
            int r = n-1;

            while(l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    while(l<r && nums[l] == nums[l-1]) {
                        l++;
                    }
                    while(l<r && nums[r] == nums[r+1]) {
                        r--;
                    }
                } else if(sum > 0) {
                    r--;
                } else {
                    l++;
                }
            }
        }

        return result;
    }
}



// Time Complexity : O(n) where n is length of height array
// Space Complexity : O(1) as we do not need any extra space other than input and output
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Solved in the class along with instructor.

// Your code here along with comments explaining your approach
// Here we will keep left pointer on 0th element and right pointer on last element. The main logic behind area is taking minimum height to cover the area. So first
// we will take minimum between these to element and multiply it with the width which will be difference between these two pointers. Then we will store maximum
// area between current area and previously stored area. We don't want to loose the maximum height so we will check if the right pointer is high we will move 
// left pointer and if left pointer is high we will move right pointer. At the end we will return maximum area.
class Solution {
    public int maxArea(int[] height) {
        
        if(height == null || height.length == 0) {
            return 0;
        }
        
        int max = Integer.MIN_VALUE;
        int n = height.length;

        // for(int i = 0; i < n-1; i++) {
        //     for(int j = i+1; j < n; j++) {
        //         int currArea = Math.min(height[i], height[j]) * (j-i);
        //         max = Math.max(max, currArea);
        //     }
        // }

        int l = 0;
        int r = n - 1;

        while(l < r) {
            int currArea = Math.min(height[l], height[r]) * (r - l);
            max = Math.max(currArea, max);
            if(height[l] <= height[r]) {
                l++;
            } else {
                r--;
            }
        }

        return max;
    }
}