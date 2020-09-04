//  11_Container_With_Most_Water

#include <iostream>
#include <vector>

using namespace std;


class Solution {
public:
/*
Two pointer approach
 Maintain two pointers one at beginning and another at end of array. If height of left pillar is smaller than right pillar increment it by 1 otherwise decrement right pointer by one. At each step calcualte the area between pillars and update the maximum area.
    
TC: O(N): N = length of array;
SC: O(1)
*/
     int maxArea(vector<int>& height) {
         if (height.size()<2)
             return 0;
         int area=0, maxArea=INT_MIN;
         int l=0, r=height.size()-1;
         while (l < r){
             area=(r - l) * min (height[l], height[r]);
             maxArea=max(area, maxArea);
             if (height[l] < height[r]) l++;
             else r--;
         }
         return maxArea;
     }
    
/*  Brute Force Approach -
    Calculate area between every possible pillar and find maximum of them. The height of smallest pillar
    should be considered as container cannot be slant.

    TC: O(N^2), SC: O(1)  N=length of array
*/
    int maxArea1(vector<int>& height) {
        int area=0;int maxArea=INT_MIN;
        int n=height.size();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                area=(j-i)*min(height[j],height[i]);
                maxArea=max(maxArea,area);
            }
        }
        return maxArea;
    }
    
};

int main(int argc, const char * argv[]) {
    vector<int> nums={1,8,6,2,5,4,8,3,7};
    Solution s;
    std::cout << s.maxArea(nums)<<endl;
    return 0;
}
