//TC: O(n)
//SC: O(1)
//Program ran on leetcode
class SortColors {
    public void sortColors(int[] nums) {
        
        int l = 0; 
        int h = nums.length - 1;
        int mid = 0; 
        while(mid <= h){
            if(nums[mid] == 0){
                int temp = nums[mid];
                nums[mid] = nums[l];
                nums[l] = temp;
                mid++;
                l++;
            }else if (nums[mid] == 1){
                mid++;
            }else{
                int temp = nums[mid];
                nums[mid] = nums[h];
                nums[h] = temp;
                h--;
            }
            
        }
        
    }
}
