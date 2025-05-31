//T.C: O(n)  no. of element in the nums[]. 
//S.c: O(1) No extra data structure is used.

/*Approach: we are taking 3 pointers each to keep track of each colour. 
low will keep track of 0, mid -> 1 and high -> 2. 
*/

class Solution {
    public void sortColors(int[] nums) {
        int low = 0,mid = 0,high = nums.length - 1;

        while(mid<=high){

            if(nums[mid] == 0){
                 swap(mid, low, nums);
                 low++;
                 mid++;
            }else if (nums[mid] == 1){
                 mid++;
            }else if(nums[mid] == 2){
                swap(mid, high, nums);
                high--;
            }
        }
        
    }


    private void swap(int mid, int idx, int[] nums){
        int temp = nums[idx];
        nums[idx] = nums[mid];
        nums[mid] = temp;
    }
}