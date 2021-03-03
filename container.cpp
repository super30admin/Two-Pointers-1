//TC: O(n)
//SC: O(1)

class Solution {
public:
    int maxArea(vector<int>& height) {
        
        //can use a two-pointer approach here. Compare areas covered by initial two pointers. Then increment the pointer who's length is smaller since if we do this then there is a change that we can reach a larger area.
        
        
        int l=0; 
        int r=height.size()-1;
        
        int maxarea = -1;
        
        while(l<r){
            
            maxarea = max(maxarea, min(height[r], height[l])*(r-l));
            
            if(height[l] < height[r])
                l++;
            else r--;            
        }
        
        return maxarea;
        
        
    }
};