/***
Leet Code Submitted : YES
Time Complexity : O(N)
Space Complexity : O(1)

We are iterating the array and each elememt checking position of middle element such that if equals to zero then swap middle and low pointer and increment both the counter. Corresspondly if middle = 1 increse middle pointer and if middle =2 then swap middle and high and decrement high pointer. It will require more practice to develop this intuition but its a good srategy to remember for future assignments
**/




class Solution {
    
    private void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i]   = arr[j];
        arr[j]   = temp;
    }
    
    public void sortColors(int[] nums) {
        int zeroIndex  = 0;
        int firstIndex = 0;
        int secondIndex = nums.length - 1;
        
        
       while(firstIndex <= secondIndex){
            if(nums[firstIndex] == 0){
                swap(nums,firstIndex,zeroIndex);
                zeroIndex++;
                firstIndex++;
            }else if(nums[firstIndex] == 2){
                swap(nums,firstIndex,secondIndex);
                secondIndex--;
            }else if(nums[firstIndex] == 1)
                firstIndex++;
            }
        
        }
    }
