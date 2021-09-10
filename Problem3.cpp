// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    int maxArea(vector<int>& height) {
        if(height.size() == 0) return 0; // null case
        int maxAr = 0;  // initialising maxArea, low & high pointers
        int low  = 0, high = height.size()-1;
        while(low<high){
            maxAr = max(maxAr, (min(height[low], height[high]) * (high-low))); // area obtained
            if(height[low] > height[high]) high--;
            else{
                low++;
            }
        }
        return maxAr;  // return max area
    }
};




// int main(){
    
//     return 0;
// }