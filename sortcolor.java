//Time Complexity: O(n)
//SPace Complexity: O(1)

class Solution {
    private void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public void sortColors(int[] nums) {
        int i=0;
        int j=0;
        int k=nums.length-1;
        while(j<=k){
            if(nums[j]==2){
                swap(nums,j,k);
                k--;
            }
            else if(nums[j]==1){
                j++;
            }
            else{
                swap(nums,j,i);
                i++;
                j++;
            }
        }
    }
}