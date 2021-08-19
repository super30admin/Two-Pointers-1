public class MxArea {
        public int maxArea(int[] height) {
    
            int maxArea=0;
    
            int left =0;
            int right =height.length-1;
    
            while(left<=right)
            {
    
                if(height[left]<height[right])
                {
                    maxArea=Math.max(maxArea,Math.min(height[left],height[right])*(right-left));
                    left++;
                }
                else if(height[left]>height[right])
                {
                    maxArea=Math.max(maxArea,Math.min(height[left],height[right])*(right-left));
                    right--;
                }
                else
                {
                    maxArea=Math.max(maxArea,Math.min(height[left],height[right])*(right-left));
                    left++;
                    right--;
                }
            }
            return maxArea;
    
        }
    }
