class Solution {
    // Time Complexity  - O(n)
    // Space Complexity - O(1)

    // Three pointers
        
             // zero_th - pointing zeroth index from left
             // two_th  - pointing 2's index on the right
             //    i    - a regular index to traverse  {only till 1s --> which means 
             //          elements to the left of i are either 0 or 1 only. If array is all 2s, 
             //          then two_th keeps on decreasing to i, and (i <= twoth) fails and exits}

    public void sortColors(int[] nums){

        
        if(nums == null) return;
        
        int zero_th = 0, i = 0, two_th = nums.length - 1;
        
        while(i <= two_th){
            
            //For zeroes
            if(nums[i] == 0){
                nums[i] = nums[zero_th]; 
                nums[zero_th++] = 0;
            }
            
            // i cant be < zero_th --> case: all zeros --> loop --> TLE            
            if( i < zero_th){
                i = zero_th;
                continue;
            }
            
            //For 2s
            if(nums[i] == 2){
                nums[i] = nums[two_th];
                nums[two_th--] = 2;
                continue;
            }
            
            
            // For 1s
            if(nums[i] == 1)
                i++;
        }
    }
}



