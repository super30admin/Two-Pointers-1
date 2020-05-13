//LeetCode 11. Container With Most Water
//Time Complexity : O(n) // n is number of containers 
//Space Complexity: O(1)
class Solution {
    public int maxArea(int[] height) {
        
        int i=0;
        int j=height.length-1;
        int area=0;
        int temp=0;
        while(i<j){
            temp= (Math.min(height[i],height[j]) * (j-i));
            area= Math.max(temp, area);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }         
        }        
        return area;
    }
}