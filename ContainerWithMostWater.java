//Time Complexity: O(n)
//Space Complexity: O(1)

class Solution {
    public int maxArea(int[] height) {
        
        int n = height.length;
        //null
        if(height == null || n == 0) return 0;
    
        //low points to the start and high points to the end of the array
        int low = 0; int high = n - 1;
        
        //initnializing max area integer as 0
        int maxArea = 0;
        
        //while the low and high pointers are not crossing each other
        while (low < high) 
        {
            //finding the max between the current maximum and the new calculated maxArea
            //calculating the maxArea by multiplying the constraining height with the width
            maxArea = Math.max(maxArea, Math.min(height[low], height[high]) * (high - low)); //***
            
            //move the low pointer to the right if the height at low is the constraining height
            if(height[low] < height[high])
            {
                low++;
            }
            //move the high pointer to the left if the height at high is the constraining height
            else
            {
                high--;
            }
        }
        return maxArea; 
    }
}

//*** https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/17/question_11.jpg
//In this figure you can see that the smaller/constraining height...
//will determine the max possible height for the area
//Also, as the pointers start moving inwards the width keeps decreasing
//that is the reason we move the pointer with lesser height inwards with a hope of finding a taller height