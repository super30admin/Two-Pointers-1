//Time Complexity O(n)
//Space Complexity O(1)

// Problem successfully compiled on leetcode
// No Problems faced while figuring out the logic

#include<vector>
#include<iostream>
using namespace std;

class Solution {
public:
    int maxArea(vector<int>& height) {
        int start = 0;
        int end = height.size()-1;
        
        int areaMax=0;
        while(end>start)
        {
            int heightMin = min(height[start],height[end]);
            int width=end-start;
            areaMax=max(areaMax,(heightMin*width));
            if(height[start]==heightMin)
            {
                start++;
            }
            else
            {
                end--;
            }
        }
        return areaMax;
    }
};