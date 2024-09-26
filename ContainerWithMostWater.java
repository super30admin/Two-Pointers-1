// Time Complexity :o(n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no
//Approach
//two pointers one ar 0 and another at last index
//initialize max =0.
//calculate the area  and compare with max and set the max to maximum
// max = Math.max(max, Math.min(height[l],height[r])*(r-l));
// move the smllser pointer in the hope of getting larger;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        if(height==null || height.length==0){
            return 0;
        }
        int n= height.length;
        int max =0;
        int l=0;
        int r=n-1;
        while(l<r){
            max = Math.max(max, Math.min(height[l],height[r])*(r-l));
            if(height[l]>height[r]){
                r--;
            }else{
                l++;
            }
        }
        return max;

    }
}
