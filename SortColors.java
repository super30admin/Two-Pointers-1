class Solution {
    //Time Complexity: O(n)
    //Space Complexity: O(1)
    public void sortColors(int[] nums) {
       if (nums == null){
        return;
       } 
       int n = nums.length;
       int left = 0;
       int right = n-1;
       int mid =0;
       while (mid<=right){
        if (nums[mid] == 2){
            swap(nums,mid,right);
            right--;
        } else if (nums[mid] == 0){
            swap(nums,mid,left);
            left++;
            mid++;
        } else{
mid++;
        }
       }
    }

    public void swap (int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
