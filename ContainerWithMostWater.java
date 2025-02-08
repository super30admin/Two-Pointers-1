// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
We use 2 pointers left and right. 
When they are equal we move right pointer, else when left is high we move right pointer.
Each time we calculate the are and find max area.
*/
class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max=0;
        int i=0;
        int len=height.length;
        int j=len-1;
        while(i<j){
            int area= Math.min(height[i],height[j])*(j-i);
            max=Math.max(max, area);
            if(height[i]>=height[j] ){
                j--;
            }else{
                i++;
            }
        }
        return max;
        
    }
}
