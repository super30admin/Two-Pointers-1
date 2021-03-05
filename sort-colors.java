class Solution {
    
  //swapping technique
    public static void swap(int[] nums,int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void sortColors(int[] nums) {
        
        //Dutch Flag algorithm - Three pointers approach
        int low = 0;
        int high=nums.length-1;
        int mid=0;//third-pointer
        
        //Traverse until mid is less than or equal to high
        while(mid<=high){
            //if 2 is at any place of mid, we sap it to end
            if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }
          //for 1 , we just move the mid pointer
            else if(nums[mid]==1){
                mid++;
            }
          //for 0, we swap mid with low pointer such that o's are always at starting
            else{
                swap(nums,mid,low);
                low++;
                mid++;
            }
        }
    }
}
