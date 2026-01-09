//Highest area-- high height and high width
//high width can be obtained with distance between low and high pointer.
//so, start low from one side and high from another side to obtain max width
//Capability to store high water at that place will comes from low container. So, low container servees as height
//Area=width * height
//move container with low heigh 
//o(m+n) ; sc: o(1)
class Solution {
    public int maxArea(int[] height) {
        int area=0;
        int low=0,high=height.length-1;

        while(low<high){
            int currArea=Math.min(height[low],height[high])*(high-low);
            area=Math.max(area,currArea);
            if(height[low]<height[high]){
                low++;
            }else{
                high--;
            }
        }

        return area;
        
    }
}
