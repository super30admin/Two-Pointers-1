class Solution {
    public int maxArea(int[] height){
        if(height==null || height.length==0){
            return 0;
        }
        int low = 0;
        int high = height.length - 1;
        int max = 0;
        while(low < high){
            int capacity = (high-low) * Math.min(height[low], height[high]);
            max = Math.max(max, capacity);
            if(height[low] < height[high]){
                low++;
            }else{
                high--;
            }
        }
        return max;
    }
}

//Time Complexity : O(n)
//Spcae Complexity : O(1)