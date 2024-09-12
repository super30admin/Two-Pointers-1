//Time comlpexity - O(N)
//Space complexity - O(1)
//Runs successfully on leetcode
class Solution {
public:
    int maxArea(vector<int>& height) {
        if(height.size()==0)
            return 0;
        int low=0;
        int high=height.size()-1;
        int max=0; //max
        while(low<high)
        {
            int current_area= min(height[low],height[high])*(high-low);
            if(current_area>max)
                max=current_area;
            if(height[low]<height[high])
                low++;
            else
                high--;
        }
        return max;
    }
};