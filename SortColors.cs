
// Time Complexity - O(n);
// Space Complexity - O(1);

// Approach -  Two Pointer Solution

// We move 0s to the front and 2s to the end, while keeping 1s in the middle.
// Use three pointers: left for 0s, right for 2s, and mid to scan the array.
// Swap accordingly and only move mid forward when the current item is 0 or 1.
public class Solution
{
    public void SortColors(int[] nums)
    {
        int mid = 0;
        int left = 0;
        int right = nums.Length - 1;
        while (mid <= right)
        {
            if (nums[mid] == 2)
            {
                Swap(nums, mid, right);
                right--;
            }
            else if (nums[mid] == 0)
            {
                Swap(nums, left, mid);
                left++;
                mid++;
            }
            else
            {
                mid++;
            }
        }
    }
    private void Swap(int[] nums, int left, int right)
    {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}