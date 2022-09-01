/* time complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public int maxArea(int[] height) {
        int low=0;
        int high=height.length-1;
        int max=0;
        while(low<high){
           max=Math.max(max,((high-low)*(Math.min(height[low],height[high]))));
            if(height[low]<height[high]){
                low++;
            }
            else{
                high--;
            }
        }
        return max;
    }
}