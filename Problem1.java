// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

//Problem1 (https://leetcode.com/problems/sort-colors/)
// Your code here along with comments explaining your approach

class Problem1 {
    public void sortColors(int[] nums) {
        threePointers(nums);
    }

    //TC:O(N)
    //SC :O(1)
    public void countAndSort(int[] nums){
        int [] count = new int[3];
        for(int i=0;i<nums.length;i++){
            count[nums[i]] = count[nums[i]]+1;
        }
        int ptr=0;
        for(int k=0;k<count.length;k++){
            int end = ptr+count[k];
            for (int j=ptr;j<end;j++){
                nums[j]= k;
                ptr++;
            }
        }

    }

    //TC:O(N)
    //SC :O(1)
    public void threePointers(int[] nums){
        int st = 0; //collects   0
        int mid = 0; // collects 1
        int end= nums.length-1; // points to 2

        while(mid<=end){
            if(nums[mid]==2){
                swapNumbersinArray(nums,mid,end);
                end--;

            }else if(nums[mid] == 0){
                swapNumbersinArray(nums,st,mid);
                st++;
                mid++;
            }else{
                //where mid is one ..since mid is collecting 1
                mid++;
            }
        }

    }

    private static void swapNumbersinArray(int[] numbers, int indexOfA, int indexOfB) {
        int a = numbers[indexOfA];
        numbers[indexOfA] = numbers[indexOfB] ;
        numbers[indexOfB]=a;
    }
}