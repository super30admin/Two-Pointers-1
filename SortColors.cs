// time complexity - O(n)
// space complexity - O(1)
// Approach - using 3 pointers. One start at start, one at end and one is a running pointer
// when running pointer points to 2 swap with end pointer and when it is pointing to 0, swap with start
public class Solution
{
    public void SortColors(int[] nums)
    {
        int start = 0;
        int end = nums.Length - 1;
        int mid = 0;

        while (mid <= end)
        {
            if (nums[mid] == 2)
            {
                swap(nums, mid, end);
                end--;
            }
            else if (nums[mid] == 0)
            {
                swap(nums, mid, start);
                start++;
                mid++;
            }
            else
            {
                mid++;
            }
        }
    }
    private void swap(int[] nums, int i, int j)
    {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}