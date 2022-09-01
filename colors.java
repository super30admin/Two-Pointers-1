/*
Using Counting Sort
Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public void sortColors(int[] nums) {
        int aux[]=new int[3];
        for(int i=0;i<aux.length;i++){
            aux[i]=0;
        }
        //incrementing indexes based on the array
        for(int i=0;i<nums.length;i++){
            aux[nums[i]]++;
        }
        //adding to get the indices 
        for(int i=1;i<aux.length;i++){
            aux[i]=aux[i-1]+aux[i];
        }
        //rewriting in the array
        int j=2;
        while(true){
            if(j!=0){
            if(aux[j]!=aux[j-1]){
                nums[aux[j]-1]=j;
                aux[j]--;
            }
            else{
                j--;
            }
            }
            else{
                int count=0;
                while(true){
                   if(aux[j]==0){
                       count=1;
                       break;
                   }
                    nums[aux[j]-1]=0;
                    aux[j]--;
                }
                if(count==1){
                    break;
                }
            }
        }
    }
}