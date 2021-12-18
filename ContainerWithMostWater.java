// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this :NO


// Your code here along with comments explaining your approach


public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        if(height==null || height.length==0){
            return 0;
        }
        int low=0;
        int high=height.length-1;
        int max=0;
        while(low<high){
            max=Math.max(max,Math.min(height[low],height[high])*(high-low));
            if(height[low]<=height[high]){
                low++;
            }
            else{
                high--;
            }
            
        }
        return max;
    }
    public static void main(String args[]){
        ContainerWithMostWater obj=new ContainerWithMostWater();
        int [] height={1,8,6,2,5,4,8,3,7};
        System.out.println(obj.maxArea(height));
    }
}
