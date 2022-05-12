//Time Complexity: O(n)
//Space Complexity: O(1)
//Leetcode: yes.

public class SortColorsLeetcode75 {
        public void sortColors(int[] nums) {
            if (nums == null) {
                return;
            }

            int fp = 0;
            int sp = nums.length -1;
            int index = 0;
            /* If element is 0 then swap it at first place and move both pointers
             * If element is 1 do nothing
             * If element is 2 then swao it with the last element and move the second pointer
             * do not move the index as the new element can be 2 again so we need to check that again
             */
            while (index <= sp) {
                if (nums[index] == 0) {
                    swap(nums, index, fp);
                    fp++;
                    index++;
                } else if (nums[index] == 2) {
                    swap(nums, index, sp);
                    sp--;
                } else {
                    index++;
                }
            }
            return;
        }

        public void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
}
