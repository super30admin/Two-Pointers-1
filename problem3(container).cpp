// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Your code here along with comments explaining your approach:take 2 pointers and move them based on the height record maximum area



class Solution {
public:
    int maxArea(vector<int>& height) {
        int n=height.size();
        int maximum=0;
        int left=0;
        int right=n-1;
        while(left<=right)
        {
            maximum=std::max(maximum,(right-left)*std::min(height[left],height[right]));
            if(height[left]<height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return maximum;
    }
};
