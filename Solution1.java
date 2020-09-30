class Solution {

    // here we shifting each color to the back by moving resting of the colors to the front.
    // for e.g if we wan to move wwhite back then will consider red, blue and shift them to front ... and repeat the process for blue.... which eventually sort the color as red , white blue.
    // Space : O(1)  Time :O(n)
    public void sortColors(int[] nums) {
        int k =0;
        int red=0, white=1, blue=2;
        for(int i =0; i < nums.length; i++){
            if(nums[i] != white){
                int tmp =0;
                tmp =nums[k];
                nums[k++] = nums[i];
                nums[i]= tmp;
            }  
            
        }
        k =0;
        
         for(int i =0; i < nums.length; i++){
            if(nums[i] != blue){
                int tmp =0;
                tmp =nums[k];
                nums[k++] = nums[i];
                nums[i]= tmp;
            }
    }}
}