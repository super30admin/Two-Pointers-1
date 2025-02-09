// time complexity - O(n)
// space complexity - O(1)
public class Solution
{
    public int MaxArea(int[] height)
    {
        int n = height.Length;
        int i = 0;
        int j = n - 1;
        int maxArea = 0;

        while (i < j)
        {
            int area = Math.Min(height[i], height[j]) * (j - i);
            maxArea = Math.Max(maxArea, area);
            if (height[i] <= height[j])
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return maxArea;
    }
}