// TC: O(N)
// SC: O(1)
// Did it run sucessfully on Leetcode? : Yes
// 1 pass sort in place solution
class Solution {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0)
            return;
        int low = 0;
        int high = nums.length-1;
        int mid = 0;
        while ( mid <= high)
        {
            if (nums[mid] == 1)
                mid++;
            else if (nums[mid] == 0)
            {
                swap(nums,mid,low);
                low++;
                mid++;
            }
            else
            {
                swap(nums,mid,high);
                high--;
            }
        }
    }
    private void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}


// counting sort : 
// TC: O(N)
// SC: O(k) , k = 3
// Did it run sucessfully on Leetcode? : Yes
// 2 pass, sort in place solution
// class Solution {
//     public void sortColors(int[] nums) {
//         int[] frequency = new int[3];
//         for ( int i = 0; i < nums.length; i++)
//         {
//             frequency[nums[i]]++;
//         }
        
//       int index = 0;  
//       for ( int i = 0; i < 3; i++){  
//         while (index < nums.length && frequency[i] != 0) {
//             nums[index++] = i;
//             frequency[i]--;
//         }
//       }
//     }  
// }

