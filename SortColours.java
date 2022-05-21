// O(n) time iterate through array one pass
// O(1) space

class Solution {
    public void sortColors(int[] nums) {
        int ptr1 = 0;
        int ptr2 = nums.length - 1;
        int i = ptr1;
        int tmp;
        
        while (i <= ptr2) {
            if (nums[i] == 0){
                tmp = nums[i];
                nums[i] = nums[ptr1];
                nums[ptr1] = tmp;
                ptr1++;
                i++;
            }
            else if (nums[i] == 2){
                tmp = nums[i];
                nums[i] = nums[ptr2];
                nums[ptr2] = tmp;
                ptr2--;
            }
            
            else{ // nums[i] = 1
                i++;
            }
        }
    }
}