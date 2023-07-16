// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
#include<iostream>
#include <vector>

using namespace std;

class Solution {
public:
    int maxArea(vector<int>& height) {


        int max=0;
        int curr;
        

       int first=0;
       int last = height.size()-1;

       while(first<last){
           
           if(height[first]<height[last]){
               curr=height[first]*(last-first);
               first++;
               

           }
           else{
               curr=height[last]*(last-first);
               last--;

           }

           if(curr>max){
               max=curr;
           }
       }

       return max;

        

        
    }
};