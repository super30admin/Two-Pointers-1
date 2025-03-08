public class problem3 {
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int maxArea(int[] height)
    {
        int n= height.length;
        int max=0;
        int l=0, r=n-1;

        while (l<r)
        {
            int h=0;
            int w=r-l;
            if (height[l]<height[r])
            {
                h= height[l];
                l++;
            }
            else {
                h= height[r];
                r--;
            }
            max= Math.max(max, h*w);
        }
        return max;
    }
}
