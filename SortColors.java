/*
This solution uses three pointers to solve the problem. Two pointers are kept at the lowest 
and highest index respectively. A running pointer that iterates through the whole array then
checks the color at each location. If the color is red, it is stored at the location pointed
to by the lowest pointer, and if it is blue, it is stored at the location pointed to by the 
highest pointer. As the running pointer moves through the array, eventually it stores all 
colors in their correct place, as the white color automatically ends up in the right location
without having to check a particular condition for it.

Did this code run on leetcode: Yes


*/
class Solution {
    
    private void swap(int[] nums, int a, int b)
    {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    //Time Complexity: O(n)
    //Space Complexity: O(1)
    public void sortColors(int[] nums) {
        
        if(nums.length == 1)
            return;
        
        int low = 0;
        int high = nums.length - 1;
        int i = 0;
        //We only iterate till we reach the high pointer, as iterating beyond that is unneccessary
        while(i <= high)
        {
            if(nums[i] == 0)
            {
                swap(nums, i, low);
                low++;
                i++;
            }
            
            else if(nums[i] == 2)
            {
                swap(nums, i, high);
                //We do not increase the iterator because we need to check the value which was swapped with the high pointer
                high--;
            }
            
            else
                i++;
        }
    }
}