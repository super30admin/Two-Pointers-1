//TC: o(n)
//SC: o(1)

class Solution {
    public void sortColors(int[] nums) {
        if(nums.length ==0 || nums== null) return;
      // low pointer will collect 0's mid pointer will collect 1's and high pointer will collect 2's
        int low =0; int mid=0; int high= nums.length-1;
        
      //iterate till mid crosses high
        while(mid<=high){
          //if mid == 2 then swap the mid and high, and. decrement high
            if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }
          //if mid == 0 then swap low and mid and increment high and mid 
          // here we are incrementing mid because we are sure that the swapped value will be more greater than 0
            else if(nums[mid] ==0){
                swap(nums,mid,low);
                low++;
                mid++;
            }
          // else we are increasing the mid
            else{
                mid++;
            }
        }
        
    }
    //swap method
    private void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp; 
    }
}
