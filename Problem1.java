
// Time: O(n)
// Space: O(1)
class Solution {
    public void sortColors(int[] nums) {
        int zero = 0 ;
        int two = nums.length-1;
        int temp;

        for(int i = 0 ;i<= two; i++){
            if(nums[i] == 0){
                temp = nums[zero];
                nums[zero] = nums[i];
                nums[i] = temp;
                zero++;
            }else if(nums[i] ==2){
                temp = nums[two];
                nums[two] = nums[i];
                nums[i] = temp;
                i--; two--;
            }
        }        
    }
}