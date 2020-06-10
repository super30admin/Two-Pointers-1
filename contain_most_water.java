// Time Complexity :O(n) n-length of the array
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes 
// Any problem you faced while coding this : -
class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1;
        int area=0;
        while(l<r)
        {
            area=Math.max(area,Math.min(height[l],height[r])*(r-l)); // store the maximum area at each iteration
            if(height[l]<height[r])  // move any one pointer at a time based on their heights for new max area
                l++;
            else
                r--;
        }
        return area;
    }
}
//Alternate approach
/*class Solution {
    public int maxArea(int[] height) {
        int out=0;
       
        for(int i=0;i<height.length;i++)
        {
            for(int j=height.length-1;j>=0;j--)
                {
                     out= Math.max(out,(j-i)*Math.min(height[j],height[i]));
                
                }
        }
        return out; 
    }
}
*/