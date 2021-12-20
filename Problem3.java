//space complexity :o(1);
//time complexity : o(n);
public class Problem3 {
    public int maxArea(int[] height) {
        if(height==null || height.length==0){
            return 0;
        }
        int maxArea=0;
        int i=0;
        int j=height.length-1;
        while(i<=j){
            maxArea = Math.max(maxArea,(j-i)*Math.min(height[i],height[j]));
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return maxArea;
    }
}
