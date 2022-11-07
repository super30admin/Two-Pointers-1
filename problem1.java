//tc is O(n) and sc is O(1)
class Solution {
    public void sortColors(int[] nums) {
        int len=nums.length-1;
        int x=0,left=0,right=len;
        
        while(x<=right){
            if(nums[x]==0){
                swap(nums,left,x);
                ++x;
                ++left;
                
            }
            else if(nums[x]==2){
                swap(nums,x,right);
                --right;
            }
            else{
                ++x;
            }
        }
        
    }
    private void swap(int[] nums,int a, int b){
        int temp=nums[a] ;
        nums[a]=nums[b];
        nums[b]=temp;
    }
    
}