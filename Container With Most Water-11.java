class Solution {
    // Two Pointer Approach 
// Time Complexity: O(n) where n is number of elements in height area
// Space Complexity: O(1) 
    public int maxArea(int[] height) {

// If height array is null or empty return 0
        if(height==null || height.length==0)
        {
            return 0;
        }

// maximum area achieved 
        int maxArea = 0;
        // length of height array
        int n = height.length;
        int left = 0;
        int right = n-1;
        
        while(left<right)
        {
            // Maximum area till now
            // Width= index at right - index at left
            // Height = Minimum of height[right] & height[left].
            // We are taking minimum as we need to create a container so we are taking minimum height to avoid overflow.
            maxArea = Math.max(maxArea, (right-left)*Math.min(height[right],height[left]));
            // As we move forward the width decreases so to maximise area we try to retain maximum height
            // So based on above we move forward or backward
            if(height[right]>height[left])
            {
                left++;
            }
            else {
                right--;
            }
        }

        
// Maximum area achieved
        return maxArea;
        
    }
}
