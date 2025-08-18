//approach-here since we have three colours i am using three variables assigning each for each color.r and b are ends while w represents the between. if w points at 0 we swap w with r and move bioth the pointers as left most index gets the 0. if w is points at 2 we swap with b and remove b to left.we are not moving w yet because after the swap the value at w might be 0 which is yet to w placed.and if w points to 1 we move it towards right.this way we are sorting the array in place in a single pass.what we are ldoing is we are pushing reds to left and blues to right while leaving whites in between.
//time complexity-O(n) as we are iterating once through the array
//space complexity=O(n) as we are not using any additional DS only variables which consume constant space
class Solution {
    public void sortColors(int[] nums) {
       int r=0;
       int b=nums.length-1;
       int w=0;
        while(w<=b){
            if(nums[w]==0){
                swap(nums,r,w);
                r++;
                w++;
            }else if (nums[w]==2){
                swap(nums,w,b);
                b--;
            }else w++;
        }
    }
    private void swap(int[]nums,int i ,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
