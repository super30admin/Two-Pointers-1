// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Container with most water

#include<iostream>
#include<vector>

using namespace std;

class Solution {
public:
    int maxArea(vector<int>& height) {
        if(height.empty())
            return 0;
        
        int area = 0;
        int left = 0;
        int right = height.size() - 1;
        int length;
        int breadth;
        
        while(left < right){
            
            length = std::min(height[left], height[right]); // minimun of two vertical lines will be the height of the container
            breadth = (right - left);
            
            area = (length * breadth) > area ? (length * breadth) : area;
            
            if(height[left] > height[right]){
                right--;
            }
            else {
                left++;
            }

        }
        
        return area;
    }
};