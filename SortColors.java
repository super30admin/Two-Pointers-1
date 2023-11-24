//time Complexity: O(n)
//space complexity: O(1)
class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid =0, high = nums.length - 1;

        while(mid<=high){
            if(nums[mid] == 2){
                swap(nums,mid,high);
                high--;
            }
            else if(nums[mid]==0){
                swap(nums,mid,low);
                low++;
                mid++;
            }
            else
                mid++;
        }
    }
    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}