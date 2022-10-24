//TC O(n)
//SC O(1)
// works in leetcode

public class ThreeColorSort {

    //Use two pointers left and right and iterator
    //0 to l-1 will have 0s
    //iterator used to compare with left and right and swap to correct position
    //r+1 to n will have 2s
    public static  void sortColors(int[] nums) {
        int n = nums.length;
        int i=0;
        int l=0;
        int r=n-1;

        while(i<=r){

            if(nums[i]==0){
                swap(nums, i,l);
                i++;
                l++;
            }
            else if(nums[i]==2){
                swap(nums,i,r);
                r--;
            }
            else i++;

        }


    }

    private static void swap(int[] nums,int i, int j){
        int temp =nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String [] args){
        int [] nums = {2,0,2,1,1,0};

        sortColors(nums);
        for (int i=0;i< nums.length;i++)
            System.out.println( nums[i]);

    }
}
