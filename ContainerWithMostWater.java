/**
 * Iterative
 * time: O(n^2)
 * space: O(1)
 * 
 * Did this code successfully run on Leetcode : Yes but Time limit exceeded
 * 
 * Approach:
 * Compare all the possibilities and get the max out of them
 * Compare the effective minimum between each element in the array
 * 
 */
class Problem36 {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0) return 0;
        int max = 0;
        
        for(int i = 0; i < height.length - 1; i++){
            for(int j = 1; j < height.length; j++){
                int min = Math.min(height[i], height[j]);
                max = Math.max(max, min * (j - i));
            }
        }
        
        return max;
    }
}

/**
 * Two pointers
 * Reduce the nested iterations
 * 
 * time: O(n)
 * space: O(1)
 * 
 * Did this code successfully run on Leetcode : Yes
 * 
 * Approach:
 * No need to compare the min height with all other heights
 * if it is smaller, as the effective height will remain the smaller one out of the two
 * 
 * [1,8,6,2,5,4,8,3,7]
 *  |               |
 *  L               R
 * 
 * min(1,7) -> 1
 * min(1,8) -> 1 => unnecessary, we can instead move our left pointer inwards
 * 
 * 1. start with two pointers L, R at the begin and end of array 
 * 2. Compare L and R
 *     If the element at pointer is smaller move pointer inwards
 *     
 */
class Problem36Approach1 {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0) return 0;
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        
        while(left < right){
            max = Math.max(max, Math.min(height[left], height[right]) * (right - left));
            
            if(height[left] <= height[right]){
                left++;
            } else{
                right--;
            }
        }
        
        return max;
    }
}

/**
 * Two pointers
 * time: O(n)
 * space: O(1)
 * 
 * Approach: same as previous just capturing the indices of the height
 */
class Problem36CaptureIndices {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0) return 0;
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        
        // to capture the indices of the container height
        int start = 0; 
        int end = 0;
        
        while(left < right){
            int curr = Math.min(height[left], height[right]) * (right - left);
            if(curr > max){
                start = left;
                end = right;
                max = curr;
            }
            
            if(height[left] <= height[right]){
                left++;
            } else{
                right--;
            }
        }
        
        System.out.println(start);
        System.out.println(end);
        
        return max;
    }
}