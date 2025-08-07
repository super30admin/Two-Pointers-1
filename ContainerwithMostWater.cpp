#include<iostream>
#include<vector>
using namespace std;
/*
Take two variables on the left most and the right most element of the array
whhile left < right assign maxArea with max of itself and product of difference of 
right and left and minimum of element in the right and left index
return the maxArea
*/
class Solution{
public:
    int maxArea(vector<int>& height) {
        int l=0, r=height.size()-1,maxArea=0;
        while(l<r){
            maxArea=max(maxArea, (r-l)*min(height[l], height[r]));
            if(height[l]<height[r]) l++;
            else r--;
        }
        return maxArea;
    }
};
