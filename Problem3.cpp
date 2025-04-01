// Time Complexity : O(N) N is size of array
// Space Complexity : O(N)  
// Did this code successfully run on Leetcode : Yes


// Your code here along with comments explaining your approach:
// 1. Keep 2 pointers at first and last and find the smaller length in this pointers.
// 2. this smaller pointer is the water this two lines can store.
// 3. Compare largest area in each camparison and return largest.

class Solution {
public:
    int maxArea(vector<int>& height) {
        int p1=0,p2=height.size()-1;
        int a=0;
        while(p1!=p2){
            int rt;
            if(height[p1]<height[p2]){
                rt=height[p1]*(p2-p1);p1++;
            }
            else{
                rt=height[p2]*(p2-p1);p2--;
            }
            if(rt>a){
                a=rt;
            }
        }
        return a;
    }
};