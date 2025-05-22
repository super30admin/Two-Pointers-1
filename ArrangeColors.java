/* Time: O(n)
Space: O(1)

Approach: Using 3 pointers
start for 0's
mid for  1's
end for 2's

check for value at mid:
1. case 2: swap with the end pointer and decrement the end pointer by 1
2. case 0 : swap with the start pointer and increment  the start pointer and mid pointer by 1
3. cae 1: no swapping required, just move the mid pointer
*/
class Solution {
    public void sortColors(int[] nums) {

        int n=nums.length;
        int start=0, end=n-1, mid=0;

        while(mid<=end){

            if(nums[mid]==2){
                swap(nums, mid, end);
                end--;
            }
            else if(nums[mid]==0){
                swap(nums, start, mid);
                start++;
                mid++;
            }
            else{
                mid++;
            }
        }
    }
    public void swap(int nums[], int l, int r){
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
    }
}