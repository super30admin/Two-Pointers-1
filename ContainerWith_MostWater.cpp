#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    int maxArea(vector<int>& height) {
        int maxi=0,low=0,high = height.size()-1;
        while(low<high){
            int x = min(height[low],height[high])*(high-low);
            maxi = max(maxi,x);
            if(height[low]<=height[high])
                low++;
            else
                high--;
        }
        return maxi;
    }
};