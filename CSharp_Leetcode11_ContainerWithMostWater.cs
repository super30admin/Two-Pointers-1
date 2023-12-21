public class Solution {
    public int MaxArea(int[] height) {
        
        int n = height.Length;
        if(n ==0 || height == null) return -1; //considering -1 showing error
        
        //[1,8,6,2,4,5,8,3,7]
        //high at and low at beginning
        //calculate area
        //update the min pointer
        //update max accordingly
        
        
        int low =0, high = n-1, maxArea = 0;
        
        while(low < high) //strictly less as l==h is the same point and doesnt make any container
        {
            int area = Math.Min(height[low], height[high]) * (high-low);
            maxArea = Math.Max(area, maxArea);
            
            if(height[low] < height[high])
            {
                low++;                
            }else
            {
                high--;
            }
        }
        
        return maxArea;
    }
}

/*
TC: O(n)
SC: O(1)

*/