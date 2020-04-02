//time - O(n)
//space - constant

//approach - initially find the area with first and last indices
//then, try moving to optimal by increasing low or decreasing high based on min b/w nums[low] and nums[high]

class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0)
        {
            return 0;
        }
        
        int answer = Integer.MIN_VALUE;
        
        int low = 0;
        int high = height.length - 1;
        
        while(low < high)
        {
            int currentArea = (Math.min(height[low], height[high]) * (high - low));
            answer = Math.max(answer, currentArea);
            if(height[low] <= height[high])
            {
                low++;
            }
            else
            {
                high--;
            }
        }
        
        return answer;
    }
}
