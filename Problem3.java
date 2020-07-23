// Time Complexity : O(n)
//      n: number of elements
// Space Complexity : O(1)
//      using input array
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
// Key Point: We need longer height to get higher area, so update smaller pointer
class Problem3 {

    /** find max area */
    public int maxArea(int[] height) {
        
        int resultMax = 0;
        
        // edge case
        if(height==null || height.length==0)
            return resultMax;
        
        // width 
        int width = height.length-1;

        // current pointer to height
        int low = 0;
        int high = width;
        
        // low and high show not cross as width becomes zero
        while(low<high){
            
            // find area
            // we need longer height to get higher area so update smaller pointer
            int tempArea = width;
            // low pointer is less
            if(height[low] < height[high]){
                tempArea *= height[low++];
                
            }else{
                // high pointer is less
                tempArea *= height[high--];
            }

            //compare with global max
            if(tempArea > resultMax)
                resultMax = tempArea;

            // in any case width will decrease
            width--;
            
        }

        // return max
        return resultMax;
    }
}