import java.util.*;

class Sample {

    // Time Complexity : O(N) N is number of elements
    // Space Complexity : O(1) 
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : No


    // Problem 1
    /**
     * 1. Get the 3 pointers, low, mid and high
     * 2. Low pointer always keeps track of 0, mid of 1 and high of 2.
     * 3. Increment mid and decrement high as per the values present at the pointers and swap whenever necessary
     */

    public void sortColors(int[] nums) {
        
        if(nums == null || nums.length == 0)
            return;
        
        int low = 0, mid = 0, high = nums.length-1;
        
        while(mid <= high) {
            if(nums[mid] == 1) {
                mid++;
            }
            else if(nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            }
            else {
                swap(nums, mid, low);
                low++;
                mid++;
            }
        }
        
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    // Time Complexity : O(N^2) N is number of elements
    // Space Complexity : O(N^2) N times N sized Map is created 
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : No


    // Problem 2
    /**
     * 1. Utilize two sum solution
     * 2. since we need to get sum as 0, put target as neagtive value of one of the elements and apply two sum for the rest of the array.
     */
    Set<List<Integer>> result;
    
    public List<List<Integer>> threeSum(int[] nums) {
        
        result = new HashSet<>();
        
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length-1; i++) {
            twoSum(nums, nums[i], i+1);
        }
        
        return new ArrayList<>(result);
    }
    
    private void twoSum(int[] nums, int target, int startingIndex) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        int reverseTarget = target*-1;
        
        for(int i=startingIndex; i<nums.length; i++) {
            
            if(map.containsKey(reverseTarget - nums[i])) {
                List<Integer> list = new ArrayList<>();
                list.add(reverseTarget - nums[i]);
                list.add(nums[i]);
                list.add(target);
                result.add(list);
            }
            else {
                map.put(nums[i], i);
            }
        }
        
    }

    // Time Complexity : O(N^2) N is number of elements
    // Space Complexity : O(N^2) N times N sized Map is created 
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : No


    // Problem 3
    /**
     * 1. Use two pointer one starting from left and other from right(end of the array)
     * 2. calculate the water contained and compare with the max value.
     * 3. check for the height of left and right pointer, decrement and increment. 
     */
    public int maxArea(int[] height) {
        
        int max = 0;
        int water = 0;
        int left = 0, right = height.length-1;
        
        while(left < right) {
            water = Math.min(height[right], height[left])*(right-left);
            max = Math.max(max, water);
            
            if(height[right] > height[left]) 
                left++;
            else
                right--;
        }
        
        return max;
    }
}