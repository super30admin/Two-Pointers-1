/* Time complexity: O(n)
Space complexity: O(1)

1. Using two pointers approach to sort the array in such a way that zeroes, ones and twos are together.
2. Starting pointers low and mid at zeroth index and high at last position. mid pointer moves to next position if the element is 1.
If its a zero, it swaps with low and if its 2, it swaps with high. 
3. While swapping mid with high, comparison is made after the swap, with element at the mid and with low/high element before incrementing the mid pointer to next position. Process is continued with all the elements.

*/ 

class Solution{
    public void sortColours(int[] nums){
        int low = 0; int high = nums.length-1; int mid = 0;
        while(mid<=high){
            if(nums[mid] == 1){
                mid++;
            }
            
            else if(nums[mid] == 0){
                swap(nums, low++, mid++);
            }

            else{
                swap(nums, mid, high--);
            }
        }
        
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}