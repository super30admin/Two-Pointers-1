//Accepted on LT
//So the idea was to have 3 pointers low would track 0 mid 1 and high 2 and based on the need just swap it
// Time would be O(n) space is constant

class Solution {
    public void sortColors(int[] nums) {
        int low =0;  
        int mid = 0;
        int high = nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(low,mid,nums);
                low++;
                mid++;

            }
            else if(nums[mid]==2){
                swap(mid,high,nums);
                high--;
            }
            else{
                mid++;
            }
        }

        
    }
    public void swap(int a,int b,int[] nums){
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]= temp;
    }
}