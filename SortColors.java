//Time complexity: O(n)
//Space complexity: O(1)


class Solution {
    public void sortColors(int[] nums) {
        
        int n = nums.length;
        if(nums == null || n == 0) return;
        
        int low = 0; //low's job is to take care of 0's
        int high = n - 1; //high's job is to take care of 2's
        int mid = 0; //mid's job is to take care of 1's
        
        //Example
        //[2[low, mid],0,2,1,1,0[high]]
        
        //looping until the mid and high pointers cross each other
        while(mid <= high) 
        {
            //if mid points to a 0 then we swap the elements at mid and low
            if(nums[mid] == 0)
            {
                swap(nums, mid, low);
                //we then increment the low and mid pointers knowing that we have placed a 0 at the front of the array 
                low++;
                mid++;
                //Example:
                //[0[low, mid], 0, 2, 1, 1[high], 2]
                //---> [0, 0[low, mid], 2, 1, 1[high], 2]
            }
            
            //if mid points to a 2 then we swap the elements at mid and high
            else if(nums[mid] == 2)
            {
                swap(nums, mid, high);
                //we then move the high to its left knowing that we placed a 2 at the end of the array
                high--;
                //Example:
                //[2[low, mid], 0, 2, 1, 1, 0[high]]
                //---> [0[low, mid], 0, 2, 1, 1[high], 2]
            }
            
            //if mid points to 1 then we move the mid pointer to the right
            else 
            {
                mid++;
                //Example:
                //[0, 0, 1[low, mid], 1[high], 2, 2]
                //---> [0, 0, 1[low], 1[high, mid], 2, 2]
            }
        }
    }
    
    //simple swap helper function
    public void swap (int [] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}