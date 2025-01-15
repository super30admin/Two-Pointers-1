public class Solution
{
    public int MaxArea(int[] height)
    {
        if (height == null && height.Length < 2)
        {
            return 0;
        }

        int max = 0;
        int left = 0, right = height.Length - 1;
        while (left < right)
        {
            max = Math.Max(max, (right - left) * Math.Min(height[left], height[right]));
            if (height[left] <= height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return max;
    }
}