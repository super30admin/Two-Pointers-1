/*Algorithm:
    1. Initialize the maxarea as -infinity.
    2. Take combination of two height from left and right, calculate area and change maxarea to the calculated area if it is greater than maxarea.
    3. If left height is less than the right height, move left pointer to the right and vice versa.
    
    Time Complexity: O(n)
    Space Complexity: O(1)
    
    Did the solution run on leetcode? Yes
*/

class Solution {
    public int maxArea(int[] height) {
        int maxArea = Integer.MIN_VALUE;
        if(height==null || height.length==0)
            return 0;
        int low = 0;
        int high = height.length-1;
        
        while(low<high){
            int area = Math.min(height[low], height[high]) * (high-low);
            if(area>maxArea)
                maxArea=area;
            if(height[low]<height[high]){
                low++;
            }else{
                high--;
            }
        }
        
        return maxArea;
        
    }
}