public class Solution
{
    public void SortColors(int[] nums)
    {
        int n = nums.Length;
        int left = 0, right = n - 1, mid = left;
        while (mid <= right)
        {
            if (nums[mid] == 2)
            {
                Swap(nums, mid, right);
                right--;
            }
            else if (nums[mid] == 0)
            {
                Swap(nums, mid, left);
                mid++;
                left++;
            }
            else
            {
                mid++;
            }
        }

    }

    public void Swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}