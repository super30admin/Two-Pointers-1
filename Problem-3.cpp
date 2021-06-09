//2 pointer approach
//area formula
//TC = O(n)
//Sc = O(1)

class Solution {
public:
    int maxArea(vector<int>& height) {
        int l = 0;
        int r = height.size()-1;
        int area =0;
        while (l<r)
        {
            area = max (area,min(height[l], 
                        height[r]) * (r - l)) ;
            if(height[l]<height[r])
                  l++;
        
            else
                   r--;
        }
        return area;
    }
};