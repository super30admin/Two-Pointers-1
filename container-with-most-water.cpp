/*The maxArea function calculates the maximum area between two lines in the histogram represented by the 'height' vector. 
It utilizes a two-pointer approach, starting with the widest possible base and gradually narrowing it down while moving the pointers towards each other. 
The current area is determined by the shorter of the two lines and the width between them. The function returns the maximum area encountered during the traversal.

Time Complexity: O(n) - The two-pointer approach involves a single pass through the array.
Space Complexity: O(1) - The algorithm uses a constant amount of extra space regardless of the input size.*/
#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    int maxArea(vector<int>& height) {
        int maxi=0;
        int low=0; int high=height.size()-1;
        while(low<high){
            int currArea=0;
            if(height[low]<height[high]){
                currArea=(height[low])*(high-low);
                low++;
            }else{
                currArea=(height[high])*(high-low);
                high--;
            }
            maxi=max(maxi,currArea);
        }
        return maxi;
    }
};