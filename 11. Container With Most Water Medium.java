//11. Container With Most Water Medium.java
/*
Time Complexity O(n)
Space Complexity O(1)
*/
 
class Solution {
    public int maxArea(int[] height) {
        if(height.length == 0)
            return 0;
        int leftIndex = 0;
        int rightIndex = height.length-1;
        int currentArea = 0;
        int maxArea = 0;
        while(leftIndex <= rightIndex){
            
            if(height[leftIndex] < height[rightIndex]){
                currentArea =  height[leftIndex] * (rightIndex - leftIndex);
                leftIndex++;
            }
            else{

                currentArea =  height[rightIndex] * (rightIndex - leftIndex);
                rightIndex--;
            }
            maxArea = Math.max(maxArea, currentArea);
        }
      return maxArea;
    } 
    
}
