
public class ContainerWithMostWater_BruteForce {
    public int maxArea(int[] height) {
        int res = 0;
        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                res = Math.max(res, Math.min(height[i],height[j])*(j-i));
            }
        }
        return res;
    }
}

// TC - O(n2)
// SC - O(1)


public class ContainerWithMostWater_Optimized {
    public int maxArea(int[] height) {
        int l = 0, r = height.length-1;
        int res = 0;
        while(l<r){
            res = Math.max(res, Math.min(height[l],height[r])*(r-l));
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }
        return res;
    }
}

// TC - O(n)
// SC - O(1)