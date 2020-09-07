//time:O(n)
//space:O(1)
public class Problem3 {
    public int maxArea(int[] height) {
        if(height==null || height.length<=1)
            return 0;
        int l=0,r=height.length-1;
        int currarea=0;
        int max=Integer.MIN_VALUE;
        
        while(l<r){
          
            if(height[l]<height[r]){
                currarea=(r-l)*height[l];
                l++;
            }
            else if(height[l]==height[r]){
                  currarea=(r-l)*height[l];
                  l++;
            }else{
                 currarea=(r-l)*height[r];
                r--;
            }
              max=Math.max(currarea,max);
         
        }
        
        return max;
    }

}

