public class SortColors {
    public void sortColors(int[] nums) {
        /*

        Approach 1:

        Iterate through the array and count the number of 0's ,1's and 2's , loop through the array again to fill
        the array with the counts starting from 0 , 1 and then 2.
        TC : O(n) where n is the length of the array
        SC: O(1) since we are only using 3 variables to store the count



        if(nums==null || nums.length==0) return;

        int cZero=0,cOne=0,cTwo=0,index=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                cZero++;
            }
            else if(nums[i]==1){
                cOne++;
            }
            else{
                cTwo++;
            }
        }


        while(cZero>0)
        {
            nums[index++]=0;
            cZero--;
        }

        while(cOne>0)
        {
            nums[index++]=1;
            cOne--;
        }

        while(cTwo>0)
        {
            nums[index++]=2;
            cTwo--;
        }

        */


        /*

        Approach 2:
        We can use two pointer approach where in we start populating 0's on left end and 2's on the right end
        0's will be tracked by low , 2's by high and 1's by mid

        TC: O(n) where n is the size of array nums
        SC: O(1)

        */

        if(nums==null || nums.length==0) return;

        int n=nums.length;
        //low tracks 0 high tracks 2 and mid tracks 1
        int low=0,high=n-1,mid=0;

        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;mid++;
            }
            else if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }
            else{
                mid++;
            }
        }
    }

    private void swap(int nums[],int i,int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
