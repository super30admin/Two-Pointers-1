/ Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    int mini(int a , int b) {
        if (a<b) return a;
        else return b;
    }
    
    int maxi(int a, int b) {
        if (a>b) return a;
        else return b;
    }
public:
    int maxArea(vector<int>& height) {
        //max water = width * height ( ie, min of two heights)
        int l = 0;
        int h = height.size() - 1;
        int max_cap = 0;
        while (l < h) {
            int width = (h - l);
            int heightt = mini(height[l], height[h]); //todo
            int cap = width * heightt;
            max_cap = maxi(max_cap, cap);
            if (height[l] <= height[h]) l++;
            else h--;
        }
        
        return max_cap;
    }
};
