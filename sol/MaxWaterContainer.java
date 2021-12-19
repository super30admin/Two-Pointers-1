package sol;

public class MaxWaterContainer {

	public int maxArea(int[] height) {
        int ans=0;
        int calc=0;
        int left=0;int rt=height.length-1;
        while(left<rt){
            
            if(height[left]>=height[rt]){calc=height[rt]*(rt-left);if(calc>ans){ans=calc;} rt--;}
            if(height[left]<height[rt]){calc=height[left]*(rt-left); if(calc>ans){ans=calc;} left++;}
            
            
            
        }
        
        return ans;
    }
	
}
