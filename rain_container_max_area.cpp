//time = O(n)
//Space = O(1)
//Leetcode: yes
//Issue seen: none
class Solution {
public:
    int maxArea(vector<int>& height) {

        int i = 0;
        int j = height.size() -1;
        int curr=0, area =0;

        while(i<j) {
            if(height[j] <= height[i]) {
                curr = (j-i) * height[j];
                j--;
            } else {
                curr = (j-i) * height[i];
                i++;
            }
            area = max (area, curr);
        }
        return area;
        
    }
};
