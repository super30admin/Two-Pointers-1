// Time complexity o(n) 
//Space complexity o(1)

class Solution {
    public void sortColors(int[] nums) {
        int m=0,l=0,h=nums.length-1;
        while(m<=h){
            if(nums[m]==2){
                swap(nums,m,h);
                h--;
            }
            else if(nums[m]==0){
                swap(nums,m,l);
                l++;m++;
            }
            else{
                m++;
            }
        }

    }
    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}