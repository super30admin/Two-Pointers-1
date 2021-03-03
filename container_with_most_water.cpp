// Time Complexity -> O(n)
// Space Complexity -> O(1)



class Solution {
public:
    int maxArea(vector<int>& height) {
        int max_ar = 0;
        int i = 0;
        int j = height.size()-1;
        while(i < j){
        int h = min(height[i],height[j]);
        max_ar = max(max_ar,h*(j-i));
        height[i]>height[j]?j--:i++;
        }
        return max_ar;
    }
};