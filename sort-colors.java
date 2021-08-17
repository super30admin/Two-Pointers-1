//Time Complexity: O(n), n is the number of elements in the array
//Space Complexity:O(1)
//running on leetcode: yes
class Solution {
    public void sortColors(int[] nums) {
        if (nums==null || nums.length==0)
        {
            return;
        }
        
        //pointers
        int low=0, mid=0, high=nums.length-1;
        while (mid<=high)
        {
            if(nums[mid]==0)
            {
                swap(nums, low,mid);
                low++;
                mid++;
            }
            else if(nums[mid]==2)
            {
                swap(nums, high,mid);
                high--;
            }
            else
            {
                mid++;
            }
        }
    }
        private void swap(int[] nums, int a, int b)
        {
            int temp = nums[a];
            nums[a]=nums[b];
            nums[b]=temp;
        }
    }
