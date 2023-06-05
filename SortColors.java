public class SortColors {
    //Time Complexity: length of array(we are not iterating the full array everytime . worst case is 2n
    //Space complexity : constant
    // Did this code successfully run on Leetcode : yes
    // Any problem you faced while coding this : no
    public void sortColors(int[] nums) {
        if(nums.length < 2){
            return;
        }
        int indexTwo = nums.length -1;
        int i =0;
        while(i <= indexTwo){
            if(nums[indexTwo] == 2){
                indexTwo--;
            }
            else if(nums[i] == 2) {
                int temp = nums[i];
                nums[i] = nums[indexTwo];
                nums[indexTwo] = temp;
                indexTwo--;
                i++;
            }
            else {
                i++;
            }
        }
        int indexOne = indexTwo;
        i =0;
        while(i <= indexOne){
            if(nums[indexOne] == 1){
                indexOne--;
            }
            else if(nums[i] == 1) {
                int temp = nums[i];
                nums[i] = nums[indexOne];
                nums[indexOne] = temp;
                indexOne--;
                i++;
            }
            else {
                i++;
            }
        }


    }
}
