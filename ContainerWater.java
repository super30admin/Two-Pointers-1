//Time Complexity: O(n);
//Space Complexity: O(1).

class Solution {
    public int maxArea(int[] height) {
        int p1 = 0;
        int p2 = height.length-1;
        
        int maxarea = Integer.MIN_VALUE;
        int area = 0;
        while(p1 <= p2){
            if(height[p1] <= height[p2]){
                area = (p2-p1) * height[p1];
                p1++;
            }
            else {
                area = (p2-p1) * height[p2];
                p2--;
            }
            
 
           maxarea = Math.max(area, maxarea);
        }
        return maxarea;
    }
}