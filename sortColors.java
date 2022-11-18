// Time Complexity : O(n)
// Space Complexity :O(1) 
class Solution {
    public void sortColors(int[] nums) {
        if(nums==null || nums.length==0) return;
        int mid=0, l=0, h=nums.length-1;    
        while(mid<=h){
            //if the mid is 2, swap it with high and then move h ptr because that num is correctly placed
            if(nums[mid]==2){
                int temp=nums[h];
                nums[h] = nums[mid];
                nums[mid] = temp;
                h--;
            }else if(nums[mid]==0){
                //if mid is 0 wasp it wid l and move both l and mid because tht position is correctly placed
                int temp=nums[l];
                nums[l] = nums[mid];
                nums[mid] = temp;
                l++;
                mid++;
            }else{
                //else move mid
                mid++;
            }
        }
    }
}