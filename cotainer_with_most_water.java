//TC: O(n)
//SC: O(1)
class Solution {
    public int maxArea(int[] height) {
        int h=height.length-1;
        int l=0;
        int area=Integer.MIN_VALUE;
         int temp;
        while(l<h)
        {
          
           temp=Math.min(height[h],height[l])*(h-l);
           if(temp>area)
           area=temp;

           if(Math.min(height[h],height[l])==height[l])
           l++;
           else
           h--;

       
        }
        return area;
    }
}