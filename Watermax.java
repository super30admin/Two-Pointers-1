
# Time complexity:O(n)
# Space complexity: 0(1)
# Did code run successfully on leetcode: yes
# Any problem you faced: No


class Solution {
    public int maxArea(int[] height) {
       int low = 0;
       int high = height.length - 1;
       int max = 0;
        while(low < high){
            int cur = (high - low) * Math.min(height[low], height[high]);
            max = Math.max(max, cur);
           if(height[low] < height[high]){
               low++;
           }
            else{
                high--;
            }
        }

        return max;
    }
}