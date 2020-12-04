class Solution {
public:
    int maxArea(vector<int>& height) {
        if(height.size() == 0) return 0;
        
        int l = 0,h = height.size()-1;
        int Max = INT_MIN;
        
        while(l<h){
            Max = max(Max, min(height[l],height[h])*(h-l));
            
            if(height[l]<height[h]){
                l++;
            }else{
                h--;
            }
            
        }
        
        return Max;
    }
};