// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int n= height.length;
        int max=0;

        int l=0;
        int r=n-1;


        while(l<r){
            int h=0;
            int w= r-l;
            if(height[l]<height[r]){
                h= height[l];
                l++;
            }else{
                h=height[r];
                r--;
            }
            max = Math.max(max, h*w);
        }
        return max;
    }

    public static void main(String args[]) {
        ContainerWithMostWater prob= new ContainerWithMostWater();
        int[] board= {1,8,6,2,5,4,8,3,7};
        System.out.println(prob.maxArea(board));
    }
}
