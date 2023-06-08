/*

// Time Complexity : O(N) lenght of the array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
The height of the continer will depend upon the smallest value. So while traversing along from low to high
the width will only decrease hence move the pointer with the lowest height
so that if we land on a larger height our area will increase as the larger height might accomodate it.

*/

#include<iostream>
#include<vector>

using namespace std;

class Solution {
public:
    int maxArea(vector<int>& height) {
        int low{};
        int high = height.size() - 1;
        int area = INT_MIN;
        while(low<high){
            int h = min(height.at(low),height.at(high));
            area = max(area,h*(high-low));
            while(low<high && height.at(low)<=h)low++;
            while(low<high && height.at(high)<=h)high--;
        }
        return area;
    }
};