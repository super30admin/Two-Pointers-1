//time - O(n)
//space - O(1)
class Solution {
    public void sortColors(int[] nums) {
        if(nums==null || nums.length==0) return;
        int low = 0, mid = 0, high = nums.length-1;

        while(mid <= high){
            if(nums[mid]==2){
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
            else if(nums[mid]==0){
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            }
            else{
                mid++;
            }
        }
    }
}