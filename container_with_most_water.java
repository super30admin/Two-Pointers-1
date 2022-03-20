// Time Complexity : O(n) where n is the length of height array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// CODE:

class container_with_most_water {
    public int maxArea(int[] height) {
        //null case
        if(height==null || height.length==0) return 0;
        int max=0;
        int n= height.length;
        int low=0,high=n-1;  
        while(low<high){
            max= Math.max(max,Math.min(height[low],height[high]) * (high-low));  //calculating max area between previous max area and current area
            if(height[low]<height[high]){  //moving away from the ptr with lower height
                low++;
            }else{
                high--;
            }
        }
        return max;
    }
}