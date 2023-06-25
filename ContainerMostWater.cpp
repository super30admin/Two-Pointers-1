// Time Complexity: O(n) 
// Space Complexity: O(1)

class Solution {
public:
    int maxArea(vector<int>& height) {
        int areaMax = 0; 
        int ptr1 = 0; 
        int ptr2 = height.size()-1; 

        while(ptr1 != ptr2) {
            int maxHeight = min(height[ptr1], height[ptr2]);
            int length = ptr2 - ptr1;
            int currArea = maxHeight * length; 
            areaMax = max(areaMax, currArea);
            if(height[ptr1] < height[ptr2]) ptr1++; 
            else if(height[ptr1] > height[ptr2]) ptr2--; 
            else ptr2--;
        }

        return areaMax;       
    } 
}; 