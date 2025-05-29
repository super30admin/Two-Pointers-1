//Sort-colors
//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution1 {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int low = 0;
        int mid = 0;
        int high = n-1;

        while(mid <= high){
            if(nums[mid] == 1){
                mid++;
            }else if(nums[mid]==2){
                swap(nums,mid,high);
                high --;
            } else{
                swap(nums, low, mid);
                    low++;
                    mid++;
                }
            }
                        
        }
    
    private void swap(int[] nums, int mid, int low){
        int temp = nums[low];
        nums[low] = nums[mid];
        nums[mid]= temp;

    }
}
