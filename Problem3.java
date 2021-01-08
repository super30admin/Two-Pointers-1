class Solution {
    public int maxArea(int[] height) {
        /**
         Algorithm (brute force):
         1. Iterate over height array
         2. Check each and every possibility (brute force)
         Algorithm:
         1. Start with min=0  and high=height.length-1
         2. if height[min]>height[high] then calculate area and decrease high
         3. else calculate area and increase min
         Time complexity - O(n)
         Space complexity - O(1)
         **/
        int area = 0;
        int min = 0;
        int high = height.length-1;

        while(min<=high)
        {
            if(height[min]>height[high])
            {
                area = Math.max(area,height[high]*(high-min));
                high--;
            }
            else
            {
                area = Math.max(area,height[min]*(high-min));
                min++;
            }
        }


        return area;
    }
}