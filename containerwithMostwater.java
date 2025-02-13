// Time Complexity : O(n)
// Space Complexity : O(1)
/*We utilize two pointers, left and right.
When they are equal, we shift the right pointer. 
Otherwise, if the left pointer has a higher value,
we move the right pointer. At each step, we compute the area and track the maximum area found. */
class Solution {
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