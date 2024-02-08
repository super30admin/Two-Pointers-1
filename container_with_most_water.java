//Time - O(n)
//space - O(1)
class Solution {
   public int maxArea(int[] height) {
       int l=0;
       int r = height.length-1;
       int maxArea = -1;
       while(l<r){
           int min = Math.min(height[l],height[r]);
           int area = min * (r-l);
           maxArea = Math.max(area,maxArea);
           if(height[l]<height[r]){
               l++;
           }
           else{
               r--;
           }
       }
       return maxArea;
      
   }
}
