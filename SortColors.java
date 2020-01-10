// Time Complexity : O(N) N is size of array. We are reading each element only once.
// Space Complexity : O(1) No extra DS used.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class DutchFlag_SortColors {
    //Intuition : To make mid values 1 and move 0's to it's left and 2's to it's right.

        public void sortColors(int[] nums) {
            //Edge cases:
            if(nums==null || nums.length==0) return;

            int high = nums.length-1;
            int low = 0;
            int mid = 0; //Important: This is not Binary Search mid. It starts from 0 index.
            while(mid<=high){
                if(nums[mid] == 1) { //Desirable. So moving forward
                    mid++;
                }
                else if(nums[mid] == 0){
                    swap(nums, mid, low);
                    low++;
                    mid++;
                }
                else{
                    swap(nums, mid, high);
                    high--;
                }
            }
        }

        public void swap(int[] nums, int i, int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

