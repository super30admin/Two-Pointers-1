//approach- BF - take two pointer starting from 0 and calculate one by one and store max result in MaxArea. 
//2 for loops, TC - O(n^2)
//SC - O(1) - we dont use extra space. 

class Solution {
    public int maxArea(int[] height) {

        if(height == null || height.length == 0) return 0;
        
        int maxArea =0;
        
        for(int i =0; i< height.length-1; i++)
        {
            for(int j =1; j< height.length ;j++)
            {
                int area = (j-i)* Math.min(height[j], height[i]);
                maxArea = Math.max(area, maxArea );
            }
        }
        
        return maxArea;
    }
}



//Optimized Approach-- take two pointers left at 0 and right at height.length -1
// calculate area and store the maxArea
//move the pinter whichever has the smallest height. 
//tc- one pass - O(n)
//Sc- O(1)

class Solution {
    public int maxArea(int[] height) {

        if(height == null || height.length < 2) return 0;
        
        int maxArea =0;

        int left =0; 
        int right = height.length -1;

        while(left < right)
        {
            int area = Math.min(height[left], height[right]) * (right -left);
            maxArea = Math.max(area, maxArea);

            if(height[left] < height[right]) 
                left++;
            else
                right--;
        }
        return maxArea;
    }
}