/**

Two Pointer Approach.

1 2

1 * 2 

height = [1,8,6,2,5,4,8,3,7]
                     48
            
            8 * 6 = 48
            7 * 7 = 49.
                          

          1 1 1 1 1 1 1 1 1 
            8 6
            
            (3-1 + 1) * 6

maximum boundaries

[8, 7]

maximum length & maximum width.

TC - O(n) where n is the length of an given array
SC - O(1) is a constant space.

0 1 2


[1,8,6,2,5,4,8,3,7]
start = 1
end = 8
**/

class Solution {
    public int maxArea(int[] height) {
        
        int start = 0;
        int end = height.length - 1;
        int maxArea = Integer.MIN_VALUE;
        
        while (start < end)
        {
            int area = Math.min(height[start], height[end]) * (end - start);
            maxArea = Math.max(area, maxArea);
            
            if (height[start] > height[end])
            {
                end--;
            }
            else
            {
                start++;
            }
        }
        
        return maxArea;
    }
}