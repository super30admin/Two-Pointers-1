//time complexity:O(n)
//space complexity:O(1)
//executed on leetcode: yes
//approach:using two pointer left, right
//any issues faced? no
class Solution {
public:
    int maxArea(vector<int>& height) {
        int l=0;
        int r=height.size()-1;
        int maxar=0;
        while(l<r)
        {
            if(height[l]<height[r])
            {
                maxar=max(maxar,(r-l)*height[l]);
                l++;
            }
            else
            {
                maxar=max(maxar,(r-l)*height[r]);
                r--;
            }
        }
        return maxar;
    }
};