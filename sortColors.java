//time complexity O(n)
//space complexity O(1)

class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0) return;
        int low = 0;
        int high = nums.length -1;
        int mid = 0;
        while(mid <= high){
                   if(nums[mid] == 0){
                    swap(nums, mid, low);
                       mid++; low++;
                } else if(nums[mid] == 2){
                    swap(nums, mid, high);
                       high--;
                } else if(nums[mid] == 1){
                        mid++;
                }
            }
        }

    private void swap(int [] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
