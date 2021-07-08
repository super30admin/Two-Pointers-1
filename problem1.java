//time-O(n)
//space- O(1)
class Solution {
    public void sortColors(int[] nums) {
        
        int i=0, j=nums.length-1;
        int k=j;
        //[2,0,1] 0,2,1
        
        while(i<=j){
            
            int curr= nums[j];
            
            if(curr==0){
                swap(nums,i++,j);
            }
            else if(curr==2){
                swap(nums,k--,j--);
            }
            else j--;
            
            
        }
    }
        
        public void swap(int[] nums,int i,int j){
            int temp= nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        
}