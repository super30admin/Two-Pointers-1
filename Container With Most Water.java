// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public int maxArea(int[] height) {
       int l=0,h=height.length-1;
       int maxi=0,area=0;

       while(l<=h)
       {
           if(height[l]<= height[h])
           {
               area=height[l]*(h-l);
               l++;
           }
           else
           {
               area=height[h]*(h-l);
               h--;
           }
           maxi=Math.max(maxi,area);
       } 
       return maxi;
    }
}