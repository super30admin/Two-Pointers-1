// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
/* we are checking both the pointers, the pointer whose length is smaller is incremented to calculate the
max area (area=length (i.e.,height )* breadth (i.e.,high-low) */


class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int h=height.length-1;
         int max=Integer.MIN_VALUE;
        while(l<h){
        max=Math.max(max,Math.min(height[l],height[h])*(h-l));
            if(height[l]<height[h])
                l++;
            else
                h--;

    }

 return max;
    }
}