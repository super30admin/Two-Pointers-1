//time complexity:O(n)
//space complexity:O(1)
public class ContainerMostWater {
        public int maxArea(int[] height) {
            if(height==null || height.length==0)
            {
                return 0;
            }
            int n=height.length;
            int left=0;
            int right=n-1;
            int max=0;
            while(left< right)
            {
                max=Math.max(max, Math.min(height[left],height[right])*(right-left) );
                if(height[left]< height[right])
                {
                    left++;
                }
                else
                {
                    right--;
                }
            }
            return max;
        }
        public static void main(String[] args)
        {
            ContainerMostWater c= new ContainerMostWater();
            int[] height={1,8,6,2,5,4,8,3,7};
           int max= c.maxArea(height);
           System.out.println(max);
        }
    }

