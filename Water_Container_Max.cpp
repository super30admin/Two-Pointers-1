class Solution {
public:
    int maxArea(vector<int>& height) {
        int max1=0,low=0, high= height.size()-1;
        while(low<high){
            int currmax = min(height[low],height[high]) * (high-low);
            max1 = max(max1, currmax);
            if(height[low]<height[high]){
                low++;
            }
            else{
                high--;
            }
        }
        return max1;
        
    }
};
