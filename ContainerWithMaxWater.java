// Time Complexity: O(n)
// Space Complexity: O(1)
// Leetcode: 11. Container With Most Water

class Solution {
    public int maxArea(int[] height) {
        
        int size=height.length;
        int area=0;
        
       int lt=0, rt=size-1;
        
        // Using 2 pointers lt and rt
        while(lt<rt)
        {
            // area= width * height
            area=Math.max(area,(rt-lt)* Math.min(height[lt],height[rt]));
            
            // Since we start from max width. The width is always decreasing, hence we pick the height that is max among lt and rt heights to get max area.
            if(height[lt]<=height[rt])
            {
                lt++;
            }
            else
            {
                rt--;
            }
        }
        
        return area;
        
    }
    
    // Brute force
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
   /*  public int maxArea(int[] height) {
        
        int size=height.length;
        int area=0;
        
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                area=Math.max(area,(j-i)*Math.min(height[i],height[j]));
                
            }
        }
        return area;
        
    }*/
}