//Time Complexity- O(n)
//Space Complexity- O(1)

class Solution {
public:
    int maxArea(vector<int>& height) {
        
        int i=0;
        int j=height.size()-1;
        int max_area=INT_MIN;
        
        while(i<j){
            max_area=max(max_area,(min(height[i],height[j]))*(j-i));
            if(height[i]<height[j]){
                i++;
            }
            else
                j--;
        }
        return max_area;
    }
};