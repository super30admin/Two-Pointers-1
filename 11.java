//two pointer

//if a[right]> a[left]  ---> left++
//if a[right] == a[left] ---> l++/r--
// i if a[right] < a[left] ---> r--

//TC - O(n)
//SC - O(1)

//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length <=1) return 0;
        
        int left = 0, right = height.length-1, curArea = 0;
        int max = Integer.MIN_VALUE;
        
        while(left < right){
            if(height[left] < height[right]){
                curArea = (right-left) * height[left];
                left++;
            } else {
                curArea = (right - left) * height[right];
               right--;
            }
            
            max = Math.max(max, curArea);
            
        }
        
        return max;
        
        
    }
}