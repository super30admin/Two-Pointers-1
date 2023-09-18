class SortColorwithCounter {

    //TC will be O(n), as traversing only once.
    //SC will be O(1).
    public void sortColors(int[] nums) {
        int n = nums.length;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for(int i=0; i<n;i++){
            if(nums[i]==0){
                count1++;
            }
            else if(nums[i]==1){
                count2++;
            }
            else{
                count3++;
            }
        }

        for(int i=0;i<n;i++){
            if(count1>0){
                nums[i]=0;
                count1--;
            }
            else if(count2>0){
                nums[i]=1;
                count2--;
            }
            else{
                nums[i]=2;
                count3--;
            }
            System.out.println(nums[i]);
        }

    }

    public static void main(String[] args){
        SortColorwithCounter obj = new SortColorwithCounter();
        int[] nums = {2,0,2,1,1,0};
        obj.sortColors(nums);
    }
}
