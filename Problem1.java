//This uses the Dutch National Flag Algorithm.

//We maintain 3 pointers:
//low → position for next 0
//mid → current element
//high → position for next 2
//Rules:
//if 0 → swap with low, move low and mid
//if 1 → move mid
//if 2 → swap with high, move high only
//
//Time: O(n)
//Space: O(1)

class Solution {

    public void sortColors(int[] nums) {

        // Pointer for next position of 0
        int low = 0;

        // Pointer for next position of 2
        int high = nums.length - 1;

        // Current pointer to traverse array
        int mid = 0;


        // Traverse until mid crosses high
        while(mid <= high) {


            // Case 1: If element is 2
            if(nums[mid] == 2) {

                // Swap current element with high pointer
                swap(nums, mid, high);

                // Decrease high pointer
                // because correct position of 2 is at end
                high--;

                // DO NOT increase mid here
                // because swapped element needs to be checked
            }


            // Case 2: If element is 0
            else if(nums[mid] == 0) {

                // Swap current element with low pointer
                swap(nums, mid, low);

                // Increase low pointer
                low++;

                // Increase mid pointer
                mid++;
            }


            // Case 3: If element is 1
            else {

                // 1 is already in correct middle position
                mid++;
            }
        }
    }



    // Swap function to exchange two elements
    private void swap(int[] nums, int x, int y) {

        int temp = nums[x];

        nums[x] = nums[y];

        nums[y] = temp;
    }
}