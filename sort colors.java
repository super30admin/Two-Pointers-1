time complexity: O(n)
space complexity: O(1)

class Solution {
    public void sortColors(int[] nums) {
        if(nums==null||nums.length<2){ //initial check
        return;
    }
 
    int[] countArray = new int[3]; //count array
    for(int i=0; i<nums.length; i++){
        countArray[nums[i]]++;  //count of each element and project it to original array
    }
 
    int j = 0;
    int k = 0;
    while(j<=2){
        if(countArray[j]!=0){
            nums[k++]=j;
            countArray[j] = countArray[j]-1;
        }else{
            j++;
    }
}
    }
}