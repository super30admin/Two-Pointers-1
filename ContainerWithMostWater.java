/* Time: O(n)
   Space: O(1)
*/
class Solution {
    public int maxArea(int[] height) {

        int left=0;
        int right=height.length-1;
        int minHeight=0;
        int res=0;

        while(left<right){
            minHeight= Math.min(height[left],height[right]);
            res=Math.max(res, minHeight*(right-left));

            if(height[left]<height[right])
                left++;
            else
                right--;
        }
        return res;
    }
}