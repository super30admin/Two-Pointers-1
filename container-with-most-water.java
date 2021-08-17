//Time complexity: O(n)
//Sace Complexity: O(1)
//running on leetcode: yes
class Solution {
    public int maxArea(int[] height) {
        if (height==null || height.length==0)
        {
            return 0;
        }
        //takepointers
        int low=0, high=height.length-1;
        int maxarea=0;
        while(low < high)
        {
            maxarea=Math.max(maxarea, (Math.min(height[low],height[high])*(high-low)));
            if (height[low]<height[high])
            {
                low++;
            }
            else
            {
                high--;
            }
        }
        return maxarea;
    }
}
