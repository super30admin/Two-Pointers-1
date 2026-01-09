

// Time Complexity - O(n);
// Space Complexity - O(1);

// Approach -  Two Pointer Solution

// Start with two pointers at both ends like left , right and keep checking the area between them.
// if left is smaller move away from left pointer and vice a versa.
// Keep track of the maximum area found during this process.
public class Solution
{
    public int MaxArea(int[] height)
    {

        int max = 0; int n = height.Length;
        int left = 0; int right = n - 1;

        while (left < right)
        {
            int min = Math.Min(height[left], height[right]);
            int width = right - left;
            int area = min * width;
            max = Math.Max(max, area);

            if (height[left] < height[right])
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


