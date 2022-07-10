//tc-O(n)
//sc-o(1)
class Solution {
public:
    int maxArea(vector<int>& height) {
      int last=height.size()-1;
        int start=0;
        int max_area=0;
        while(start<last){
            if(height[start]<height[last]){
                max_area=max(max_area,height[start]*(last-start));
                start++;
            }
            else {
                max_area=max(max_area,height[last]*(last-start));
                last--;
            }
        }
        return max_area;
    }
};