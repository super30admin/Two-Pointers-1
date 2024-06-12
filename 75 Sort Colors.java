class Solution {
    public void sortColors(int[] nums) {
     
        int zeroPointer = -1;
        int twoPointer = nums.length;
        int currentPointer = 0;
        
    
        
        while(currentPointer < twoPointer && currentPointer < nums.length)
        {
            int currentElement = nums[currentPointer];
            if(currentElement == 0){
                zeroPointer++;    
                if(currentPointer != zeroPointer)
                {
                    nums[currentPointer] = nums[zeroPointer];
                    nums[zeroPointer] = 0;
                }
                else
                    currentPointer++;
            }
            if(currentElement == 2){
                twoPointer--;    
                if(currentPointer != twoPointer)
                {
                    nums[currentPointer] = nums[twoPointer];
                    nums[twoPointer] = 2;
                }
                else
                    currentPointer++;
            
                      
        }  
        if(currentElement == 1){
            currentPointer++;
        }
    
    }
        
    	}
}

/*
Time Complexity: O(n)
Space Complexity: O(1)

*/

