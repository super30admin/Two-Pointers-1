class Solution {
    public int maxArea(int[] nums) {
        int max=0;
        int area=0;
       int i=0;
       int j=nums.length-1;

       while(i<j){
        if(nums[i]<nums[j]){
        area=nums[i]*(j-i);
         i++;
        }else{
            area=nums[j]*(j-i);
            j--;
        }
        if(max<area)
         max=area;

       }
        
            
        
         return max;
    }
}