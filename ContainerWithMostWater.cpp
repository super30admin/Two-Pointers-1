// Time Complexity :  O(n) where n = size of input 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

// Three line explanation of solution in plain english
/* Use two pointers low and high. Initialize low pointer to start of array and high pointer to end of array.
 * Calculate area by using following formula :- min(height[low], height[high]) * (high - low)
 * If the current area is greater than previous max area then update the max area with current area. 
 * Move the pointer with a smaller height, if low pointer height is smaller, then increment low pointer else decrement high pointer.
 * Repeat the above steps until low pointer is smaller than high pointer.  
 */

class Solution {
public:
    int maxArea(vector<int>& height) {
        
        if (height.size() == 0)
        {
            return 0;
        }
        
        int low = 0;
        int high = height.size() - 1;
        int max_area = 0;
        
        while (low < high)
        {
            max_area = max(max_area, (high - low) * min(height[low], height[high]));
            
            if (height[low] < height[high])
            {
                low++;
            }
            else
            {
                high--;
            }
        }
        
        return max_area;
    }
};