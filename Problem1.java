//Sort Color

//Time COmplecity: O(n)
//Space Complexity: O(1).




class Solution {
    public void sortColors(int[] nums) {


        for(int i=0;i<nums.length;i++){

            for(int j=i;j<nums.length;j++){

                if(nums[i] > nums[j]){

                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

    }
}