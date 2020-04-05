// Time Complexity : O(n)n=number of elements in  array . 
// Space Complexity : O(1) because no extra data structure is used/
// Did this code successfully run on Leetcode :yes. 

// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
//just taking the pattern of the two pointers, we check the minimun between l and r, then this value is multiplies per (r - l), and keep the max
//Success
//Details 
//Runtime: 2 ms, faster than 94.71% of Java online submissions for Container With Most Water.
//Memory Usage: 40.2 MB, less than 93.59% of Java online submissions for Container With Most Water.
  public int maxArea(int[] height) {
        if (height==null || height.length==0)
            return 0;
        int l=0;
        int r=height.length-1;
        int maxArea=0;
        int cArea=0;
        while (l<r){
            cArea= Math.min(height[l],height[r])*(r-l);
            if (height[r]>height[l])
                l++;
            else
                r--;
            maxArea=Math.max(maxArea,cArea);
        }
        return maxArea;
    }