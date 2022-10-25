package s30.arrays.twoPointers;


// Time Complexity : O(n) >>> n being the size of the array
// Space Complexity: O(1)

public class SortColors {
    public void sortColors(int[] nums) {
        int zeroIndex=0;

        int twoIndex = nums.length-1;

        int index =0;
        while(index <= twoIndex){
            if(nums[index]== 0 ){
                swap(nums,zeroIndex,index);
                zeroIndex++;
                index++;

            }
            else if(nums[index] ==2){
                swap(nums,twoIndex,index);
                --twoIndex;
            }else {
                index++;
            }


        }

    }


    private void swap(int[] nums, int i, int j){
        int temp = nums[i];

        nums[i] = nums[j];

        nums[j]= temp;
    }

    public static void main(String[] args) {

    }
}
