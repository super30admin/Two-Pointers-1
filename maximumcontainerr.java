// Time Complexity :o(n)
// Space Complexity :0(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach:-for rectangle area to be maximum width and heiht should be maximum so for getting maximum width iterating over heights either from left or from right depending upon height values.








class Solution {
    public int maxArea(int[] height) {
         int a_pointer = 0;
        int b_pointer = height.length - 1;
        int max_area = 0;
        
        while(a_pointer < b_pointer)
        {
            if(height[a_pointer] < height[b_pointer])
            {
                max_area = Math.max(max_area ,  height[a_pointer] * (b_pointer-a_pointer) );
                a_pointer++;
            }
            else 
            {
                 max_area = Math.max(max_area , height[b_pointer] * (b_pointer-a_pointer)  );
                b_pointer--;
            }
            
        }
        
        return max_area;
        
    }
}

  
    
