// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
import java.util.*;

public class containerMostWater {

     public int maxArea(int[] height) {
        if(height==null || height.length==0){
            return 0;
        }
        int n=height.length;
        int max=0;
        int left=0;
        int right=n-1;

        while(left<right){
            int hl=height[left];
            int hr=height[right];
            max=Math.max(max,Math.min(hr,hl)*(right-left));
            if(hl<hr){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        containerMostWater ts = new containerMostWater();
        int[] m1= {1,8,6,2,5,4,8,3,7};
        int[] m2=  {1,1};
        System.out.println(ts.maxArea(m1));// ans = 49
        System.out.println(ts.maxArea(m2));// ans = 1
    }
}
