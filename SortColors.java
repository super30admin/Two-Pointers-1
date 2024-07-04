/**
 Approach: 2 pointers (internally 3 pointers)

 Working:
     declare pointers
         left = 0, - where zero should be placed
         right = arr.length-1, where 2 is placed
         mid = 0
         when mid<=right
             check if value in mid is 2
                 swap mid and right, to place the 2 in its correct position
                 decrement right
             check if value in mid is 0
                 swap mid and left . to place zero in the correction position
                 increment left and mid
             else
             while encountering one increment mid
         now the input array will be sorted

 Time Complexity: O(n)
 Space Complexity: O(1)
 */

class SortColors {
    public void sortColors(int[] nums) {

        if(nums == null ||  nums.length ==0) {
            return;
        }

        int n = nums.length;
        int left =0, mid =0, right = n-1;

        while(mid<=right) {

            if(nums[mid] == 2) {
                swap(nums, mid, right);
                right--;
            }
            else if(nums[mid] == 0) {
                swap(nums, mid, left);
                left++;
                mid++;
            }
            else {
                mid++;
            }
        }
    }

    private void swap(int[] a, int index1,int index2) {

        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }
}