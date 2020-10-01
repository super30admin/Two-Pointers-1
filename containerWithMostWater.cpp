// Time Complexity : O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
public:
    int maxArea(vector<int>& height) {
        int maxi=INT_MIN;
        int a_pointer=0;
        int b_pointer=height.size()-1;
        while (a_pointer<b_pointer) {  //loop till the two pointers don't meet
            int mini=min(height[a_pointer],height[b_pointer]); //select minimum of the 2 heights
            maxi= max(maxi,mini*(b_pointer-a_pointer)); //mini * subtraction of the coordinates which will give the max area of the rectangle
            
            if (height[a_pointer]<height[b_pointer]) {
               a_pointer++; 
            } else {
                b_pointer--;
            }
        }
        return maxi;
    }
};