// Time Complexity : O(n), where n is the size of the array.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES


class Solution {
public:
    int maxArea(vector<int>& height) {
        int max = 0;
        int low = 0;
        int high = height.size()-1;
        while(low<high){
            int currentArea = 0;
            if(height.at(low)<=height.at(high)){
                int width = high - low;
                currentArea = height.at(low) * width;
                low++; 
            }
            else{
                int width = high - low;
                currentArea = height.at(high) * width ;
                high--;
            }
            max = std::max(max, currentArea);
        }
        return max;
    }
};