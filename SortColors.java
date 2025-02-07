/* Time Complexity: O(n) only one pass through the array using three pointers.
 * Space Complexity: O(1) no extra space needed
 * Leetcode: Yes
 * Any Issues: nos
 */
class Solution {
    private void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void sortColors(int[] nums) {
        int nextPossible0thPlace = 0;
        int end = nums.length-1;
        int start = 0;
        while(start<end)
        {
            if(nums[start] == 0 )
            {
                if(nextPossible0thPlace != start)
                    swap(nums, nextPossible0thPlace++, start);
                else
                {
                    nextPossible0thPlace++;
                    start++;
                }
            }
            else if(nums[start] == 2)
            {
                swap(nums, end, start);
                end--;
            }
            else
                start++; 
        }
        if(nums[start] == 0)
            swap(nums, start, nextPossible0thPlace);
    }
}