//Time Complexity:O(n)
//Space Complexity:O(1)
class Solution {
    public int maxArea(int[] height) {
        if(height==null||height.length==0) return -1;

        int low = 0, high = height.length-1;
        int maxWaterCapacity = Integer.MIN_VALUE, currentWaterCapacity;
        while(low<high){
            currentWaterCapacity = Math.min(height[low],height[high])*(high-low);
            maxWaterCapacity= Math.max(maxWaterCapacity,currentWaterCapacity);
            if(height[low]<height[high])
                low++;
            else
                high--;
        }

        return maxWaterCapacity;
    }
}