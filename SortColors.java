class Solution {
//TC--> O(n)
//SC--> O(1)
    public void sortColors(int[] nums) {
        
        int high = nums.length-1;
        int low = 0;
        int mid = 0;

    while(mid<=high)    {
        if(nums[mid]==0)  {
            int tmp = nums[low];
            nums[low] = nums[mid];
            nums[mid] = tmp;
            low++;
            mid++;
            }

        else if(nums[mid] ==2){
            int tmp = nums[mid];
            nums[mid]=nums[high];
            nums[high]= tmp;
            high--;
            }
        else
        mid++;
        
        }
    }
}