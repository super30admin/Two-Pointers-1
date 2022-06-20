class Solution {
    //Time complexity: O(n)
    //Space complexity: O(1)
    public void sortColors(int[] nums) {
        int l=0,h=nums.length-1,i=0;
        while(i<=h){
            if(nums[i]==0){
                int t=nums[l];
                nums[l]=nums[i];
                nums[i]=t;
                l++;
                i++;
            }
            else if(nums[i]==2){
                int t=nums[h];
                nums[h]=nums[i];
                nums[i]=t;
                h--;
            }
            else{
                i++;
            }   
        }
    }
}