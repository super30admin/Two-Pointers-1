//keep 3 pointers, mid for traversal, i and j for keeping track of the 0s and 2s
//increase i when 0 is encountered at mid and swap
//Time complexity: O(n)
//Space complexity: O(1)
class Solution {
    public void sortColors(int[] nums) {

        int i=0;
        int mid=0;
        int j=nums.length-1;
        while(j>=mid) {
            if(nums[mid]==0) {
                swap(i,mid,nums);
                i++;
                mid++;
            } else if(nums[mid]==1) {
                mid++;
            } else {
                swap(mid,j,nums);
                j--;
            }
        }
    }
    public void swap(int i, int j, int[] nums) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}