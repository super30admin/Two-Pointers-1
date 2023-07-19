// Container With Most Water
//Time Complexity:O(n)
//Space Complexity:O(1)
class Solution2 {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int area=Integer.MIN_VALUE;
        int temp=0;
        while(i<j)
        {
            //we will always consider min height from 2 when we calculate area
            if(height[i]<=height[j])
            {
                temp=height[i]*(j-i);
                i++;
            }
            else
            {
                temp=height[j]*(j-i);
                j--;
            }
            area=Math.max(area,temp);
        }
        return area;
    }
}