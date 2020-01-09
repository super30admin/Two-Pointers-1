//no extra space
/*********** Time Complexity: O(n) ************/
/*********** Space Complexity: O(1) ************/

class Solution {
    public void sortColors(int[] nums) {
    
    //left and right of array
    int left = 0, right = nums.length - 1, index = 0;
        
    for(int i=0; i< nums.length; i++){
    
        //swap the element to left if index = 0
        if (nums[index] == 0) {
            nums[index] = nums[left];
            nums[left] = 0;
            left++;
        }
        
        //swap the element to right if is 2
        if (nums[index] == 2) {
            nums[index] = nums[right];
            nums[right] = 2;
            right--;    //from left<-right
            index--;
        }
        index++;
    }
}
}


//Counting sort
/*********** Time Complexity: O(m+n) ~ O(n) ************/
/*********** Space Complexity: O(m+n) ~ O(n) ************/

class Solution {
    public void sortColors(int[] nums) {
        int length = nums.length;
        
        if(length == 0 || nums == null)
            return;
        
        int[] count = new int[3];
          
        //initialize array of count with 0
        for(int i = 0; i < 3; i++){
            count[i] = 0; 
        }
        
        //store the count of times nums value occurred
        for(int i = 0; i<length; i++){
            count[nums[i]]++;
        }        
     
        int k = 0;
        for(int i=0; i<count.length; i++) 
        {    
    		for(int j=0; j<count[i]; j++)
            {
    			nums[k++] = i;
    		}
    	}

    }
}