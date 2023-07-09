//time complexity = O(N)
//Space complexity = O(1)

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int left= 0;
        int mid = 0;
        int right = n-1;

        while(mid<= right){
            if(nums[mid]==2){
                swap(nums,mid,right);
                right--;
            }else if(nums[mid]==0){
                swap(nums,mid,left);
                left++;
                mid++;
            }else {
                mid++;
            }
        }

    }

    private void swap(int[] nums,int i, int j){
        if (i==j)return;
        int temp = nums[i];
        nums[i]= nums[j];
        nums[j]= temp;
    }
}